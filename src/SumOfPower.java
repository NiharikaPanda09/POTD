import java.util.*;
public class SumOfPower {
    public static void main(String[] args) {
   int n = 21;
        System.out.println(checkPowersOfThree(n));
    }
    public static boolean checkPowersOfThree(int n) {
   if(n == 0) return true;
   while(n>0){
       if(n%3 == 2) return false;
        n/= 3;

   }


   return true;
    }
}
