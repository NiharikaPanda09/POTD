import java.util.*;
public class NumOfOddSumSubArr {
    public static void main(String[] args) {
    int [] arr = {1,3,5};
        System.out.println(numOfSubarrays(arr));
    }
    public static int numOfSubarrays(int[] arr) {
        int sum = 0;
        int cnt = 0;
      for(int a:arr){
          sum += a;
          cnt += sum %2;
      }
      cnt += (arr.length - cnt)* cnt;
      return (int)cnt%1_000_000_007;
    }
}
