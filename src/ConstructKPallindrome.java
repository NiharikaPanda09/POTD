import java.util.*;
public class ConstructKPallindrome {
    public static void main(String[] args) {
     String s = "anabelle";
     int k = 3;
        System.out.println(canConstruct(s,k));
    }
    public static boolean canConstruct(String s, int k) {
      if(k > s.length()){
          return false;
      }
      HashMap<Character,Integer> map = new HashMap<>();
      for(char c:s.toCharArray()){
          map.put(c, map.getOrDefault(c,0)+1);
      }
      int cnt = 0;
      for(int count : map.values()){
          if(count%2 != 0){
             cnt++;
          }
      }
      return cnt<= k;
    }
}
