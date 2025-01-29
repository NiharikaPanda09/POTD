import java.util.*;
public class UniqueBinary {
    public static void main(String[] args) {
   String [] s  = {"01","10"};
        System.out.println(findDifferentBinaryString(s));
    }
    public static String findDifferentBinaryString(String[] nums) {
   StringBuilder res = new StringBuilder();
   for(int i=0;i<nums.length;i++){
       if(nums[i].charAt(i) == '0'){
           res.append('1');
       }else{
           res.append('0');
       }
   }
   return res.toString();
    }
}
