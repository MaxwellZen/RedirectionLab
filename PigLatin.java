import java.util.*;
import java.io.*;
public class PigLatin {
  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    if (s.charAt(0)=='a' || s.charAt(0)=='e' || s.charAt(0)=='i' || s.charAt(0)=='o' || s.charAt(0)=='u') {
      return s + "hay";
    } else {
      return s.substring(1) + s.substring(0, 1) + "ay";
    }
  }
  public static String pigLatin(String s){
    s = s.toLowerCase();
    String vowels[] = {"a", "e", "i", "o", "u"};
    for (int i = 0; i < vowels.length; i++) {
      if (s.substring(0, 1).equals(vowels[i])) return s + "hay";
    }
    String digraph[] = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i = 0; i < digraph.length; i++) {
      if (s.substring(0, 2).equals(digraph[i])) return s.substring(2) + s.substring(0, 2) + "ay";
    }
    return s.substring(1) + s.substring(0, 1) + "ay";
  }
  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    if (s.length()<=1) return s;
    if (! Character.isLetter(s.charAt(0))) return s;
    if (! Character.isLetter(s.charAt(s.length()-1))) return pigLatin(s.substring(0, s.length()-1))+s.substring(s.length()-1);
    return pigLatin(s);
  }
  public static void main(String args[]) {
    System.out.println(pigLatinBest(args[0]));
  }
}
