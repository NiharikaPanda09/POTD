import java.util.*;
public class StringMatching {
    public static void main(String[] args) {
    String [] str = {"leetcode","et","code"};
        System.out.println(stringMatching(str));
    }
    public static List<String> stringMatching(String[] words) {
     List<String> list = new ArrayList<>();
     Arrays.sort(words,Comparator.comparingInt(String::length));
        //length comparison
     for(int i  = 0;i<words.length;i++){
         for(int j=i+1;j< words.length;j++){
             if(  words[j].contains(words[i])){
                 list.add(words[i]);
                 break;
             }
         }
     }
        return list;

    }
}
