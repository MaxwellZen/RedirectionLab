import java.util.*;
import java.io.*;
public class PigLatin {
  public static String pigLatinSimple(String s){
    s = s.toLowerCase();
    String vowels[] = {"a", "e", "i", "o", "u"};
    for (int i = 0; i < vowels.length; i++) {
      if (s.substring(0, 1).equals(vowels[i])) return s + "hay";
    }
    return s.substring(1) + s.substring(0, 1) + "ay";
  }
  public static String pigLatin(String s){
    s = s.toLowerCase();
    String digraph[] = {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    for (int i = 0; i < digraph.length; i++) {
      if (s.length()>=2 && s.substring(0, 2).equals(digraph[i])) return s.substring(2) + s.substring(0, 2) + "ay";
    }
    return pigLatinSimple(s);
  }
  public static String pigLatinBest(String s){
    s = s.toLowerCase();
    if (s.length() ==0) return s;
    if (! Character.isLetter(s.charAt(0))) return s;
    if (! Character.isLetter(s.charAt(s.length()-1))) return pigLatin(s.substring(0, s.length()-1))+s.substring(s.length()-1);
    return pigLatin(s);
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    while (s.hasNext()) {
      String t = s.nextLine();
      Scanner u = new Scanner(t);
      while (u.hasNext()) {
        String v = u.next();
        System.out.print(pigLatinBest(v));
        if (u.hasNext()) System.out.print(" ");
      }
      System.out.println();
    }
  }
}
