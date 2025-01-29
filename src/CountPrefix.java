import java.util.*;
public class CountPrefix {
    public static void main(String[] args) {
  String [] words = {"leetcode","win","loops","success"};
  String pref = "at";
        System.out.println(prefixCount(words,pref));
    }
    public static int prefixCount(String[] words, String pref) {
        int cnt = 0;
       for(int i=0;i<words.length;i++){
           if(words[i].startsWith(pref)){
               cnt++;
           }
       }
       return cnt;
    }
}
