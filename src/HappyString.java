import java.util.*;
public class HappyString {
    public static void main(String[] args) {
       int n = 1;
       int  k= 3;
        System.out.println(getHappyString(n,k));
    }
    public static String getHappyString(int n, int k) {
    List<String> happyString = new ArrayList<>();
    generateHappyString(n,"",happyString);
      return k <= happyString.size()?happyString.get(k-1):"";
    }

    private static void generateHappyString(int n, String curr, List<String> happyString) {
        if(curr.length() == n){
            happyString.add(curr);
            return;
        }
       for(char ch:new char[]{'a','b','c'}){
           if(curr.isEmpty() || curr.charAt(curr.length()-1) != ch){

               generateHappyString(n,curr+ch,happyString);
           }
       }
    }
}
