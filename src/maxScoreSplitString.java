import java.util.*;
public class maxScoreSplitString {
    public static void main(String[] args) {
      String s = "011101";
        System.out.println(maxScore(s));
    }
    public static int maxScore(String s) {
     int totalOnes =  0;
     for(char c: s.toCharArray()){
         if(c == '1'){
          totalOnes++;
         }
     }

     int leftZero = 0;

     int rightOnes = totalOnes;
     int max = 0;
     for(int i=0;i<s.length()-1;i++){
         if(s.charAt(i) == '0'){
             leftZero++;
         }else {
             rightOnes--;
         }
         int curr = leftZero + rightOnes;
        max = Math.max(max,curr);
     }
        return max;
    }
}
