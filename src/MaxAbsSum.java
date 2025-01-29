import java.util.*;
public class MaxAbsSum {
    public static void main(String[] args) {
     int [] arr = {2,-5,1,-4,3,-2};
        System.out.println(maxAbsoluteSum(arr));
    }

    public static int maxAbsoluteSum(int[] nums) {


   return Math.max(kadane(nums),Math.abs(reverseKadane(nums)));

    }
    private static int kadane(int [] arr){
        int max = arr[0];
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            max =(Math.max(max+arr[i],arr[i]));
            res = Math.max(res,max);
        }
        return res;
    }
    private static int reverseKadane(int [] arr){
        int min = arr[0];
        int res = arr[0];
        for(int i=1;i<arr.length;i++){
            min = Math.min(min+arr[i],arr[i]);
            res = Math.min(res,min);
        }
        return res;
    }
}
