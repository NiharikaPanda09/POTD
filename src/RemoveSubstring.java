import java.util.*;
public class RemoveSubstring {
    public static void main(String[] args) {
       String s = "daabcbaabcbc";
        System.out.println(removeOccurrences(s,"abc"));
    }
    public static String removeOccurrences(String s, String part) {
      StringBuilder str = new StringBuilder(s);
      int i;
      while((i = str.indexOf(part)) != -1){
          str.delete(i,i+part.length());
      }

        return str.toString();

    }
}
