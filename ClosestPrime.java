import java.util.*;
public class ClosestPrime {
    public static void main(String[] args) {
   int left = 10;
   int right = 19;
        System.out.println(Arrays.toString(closestPrimes(left, right)));
    }
    public  static int[] closestPrimes(int left, int right) {
       ArrayList<Integer> arr = new ArrayList<>();

        for(int i=left;i<=right;i++){
          if(isPrime(i)){
             arr.add(i);
          }
        }
        if (arr.size() < 2) return new int[]{-1, -1};
       int minDiff = Integer.MAX_VALUE;
        int [] Pair = new int[2];
        for(int i=0;i<arr.size()-1;i++){
            int min = arr.get(i+1) - arr.get(i);
            if(min <minDiff){
                minDiff = min;
                Pair[0] = arr.get(i);
                Pair[1] = arr.get(i+1);
            }
        }
        return Pair;

        }

    public static boolean isPrime(int val){
        if(val<=1) return false;
        if(val == 2 || val == 3) return true;
        if(val %2 == 0 || val%3 == 0) return false;
        for (int i = 5; i * i <= val; i += 6) {
            if (val % i == 0 || val % (i + 2) == 0) return false;
        }
        return true;
    }
}
