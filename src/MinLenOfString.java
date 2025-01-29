import java.util.*;
public class MinLenOfString {
    public static void main(String[] args) {
        String s = "abaacbcbb";
        System.out.println(minimumLength(s));
    }
    public static int minimumLength(String s) {
        int cnt = 0;
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c : s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(int  mp:map.values()){
           while(mp>=3){
               cnt +=2;
               mp -= 2;
           }
        }
        return s.length()-cnt;
    }
}
