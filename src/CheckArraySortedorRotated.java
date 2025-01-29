import java.util.*;
public class CheckArraySortedorRotated {
    public static void main(String[] args) {
     int[] nums = {3,4,5,1,2};
        System.out.println(check(nums));
    }
    public static boolean check(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            if(nums[i] > nums[(i+1)%n]){
                cnt++;
            }
        }
        return cnt<=1;
    }

}
