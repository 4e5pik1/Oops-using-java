import java.io.*;
import java.util.*;
class nonrepeated
{
 
  public static void Repeated(String s)
  {
 
    for (int i = 0; i < s.length(); i++) {
 
      if (s.indexOf(s.charAt(i), s.indexOf(s.charAt(i)) + 1) == -1) {
        System.out.println("repeated letter"+ s.charAt(i));
        break;
      }
    }
    return;
  }
  public static void main (String[] args) {
    String s = "management";
    Repeated(s);
  }
}