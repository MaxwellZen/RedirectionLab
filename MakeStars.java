import java.util.*;
import java.io.*;
public class MakeStars {
  public static void main (String args[]) {
    Scanner s = new Scanner(System.in);
    while (s.hasNext()) {
      String t = s.nextLine();
      Scanner u = new Scanner(t);
      while (u.hasNext()) {
        String v = u.next();
        for (int i = 0; i < v.length(); i++) {
          System.out.print("*");
        }
        System.out.print(" ");
      }
      System.out.println();
    }
  }
}
