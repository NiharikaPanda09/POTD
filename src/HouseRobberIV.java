import java.util.*;
import java.util.Arrays;
public class HouseRobberIV {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9};
        System.out.println(minCapability(arr, 2));
    }

    public static int minCapability(int[] nums, int k) {


        int left = 1;
        int right = Arrays.stream(nums).max().getAsInt();
        int ans = right;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cnt = 0;
            for (int i = 0; i < nums.length; i++) {
                if (nums[i] <= mid) {
                    cnt++;
                    i++;
                }
            }
            if (cnt >= k) {
                ans = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }
        return ans;
    }
}
//
//    private static boolean canRob(int[] nums,int mid,int k) {
//        int cnt = 0;
//        int n = nums.length;
//        for(int i=0;i<n;i++){
//            if(nums[i] <= mid){
//                cnt++;
//                i++;
//            }
//        }
//        return cnt >= k;
//    }
//}
