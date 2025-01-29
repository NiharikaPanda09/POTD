import java.util.*;
public class ParenthesisString {
    public static void main(String[] args) {
      String s = ")(";
      String locked = "00";
        System.out.println(canBeValid(s,locked));
    }
    public static boolean canBeValid(String s, String locked) {
//      for(int i=0;i<s.length();i++){
//          for(int j=0;j<locked.length();j++){
//              if(s.charAt(i)==')'){
//                  while(i-- >0){
//                      if(s.charAt(i--) == ')' && locked.charAt(j) == '0'){
//                          return true;
//                      }
//                  }
//              } else if (s.charAt(i) == '(') {
//                  while(i++ < s.length()){
//                      if(s.charAt(i++) == '(' && locked.charAt(j) == '0')
//                          return true;
//                  }
//              }
//          }
//      }
//      return false;



       //we try a two way pass algorithm so ya you know the drill
        // leftToRight and right to left

        //odd number of counts we cant do it
        if(s.length() %2 != 0) return false;
        int open = 0;
        int unlocked = 0;
        for(int i=0;i<s.length();i++){
             if(s.charAt(i) == '('){
                 open++;
             } else if (locked.charAt(i) == '0') {
                 unlocked++;
             } else if (open > 0) {
                 open--;
             } else if (unlocked > 0) {
                 unlocked--;
             }else{
                return false;
             }
        }
        int close = 0;
        unlocked = 0;
        for(int j=s.length()-1;j>0;j--){
            if(s.charAt(j) == ')'){
                close++;
            } else if (locked.charAt(j) == '0') {
                unlocked++;
            } else if (close > 0) {
                close--;
            } else if (unlocked > 0) {
                unlocked--;
            }else{
                return false;
            }
        }
        return true;
    }
}
