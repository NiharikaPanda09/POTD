
import java.util.*;
public class LexiSmall {
    public static void main(String[] args) {
     int[] ans = {1,5,3,9,8};
        System.out.println(Arrays.toString(lexicographicallySmallestArray(ans, 2)));
    }
    public static int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        //for storing
      int [] ans = new int[nums.length];

        //two loops
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(Math.abs(nums[i]-nums[j]) <= limit){
                  swap(nums,i,j);

                }
            }
        }
        System.arraycopy(nums,0,ans,0,n);
        return ans;

    }
  static    void swap(int [] nums,int i,int j){
        if(nums[i] > nums[j]) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

  }
}

import java.util.*;
public class LexiSmall {
    public static void main(String[] args) {
     int[] ans = {1,5,3,9,8};
        System.out.println(Arrays.toString(lexicographicallySmallestArray(ans, 2)));
    }
    public static int[] lexicographicallySmallestArray(int[] nums, int limit) {
        int n = nums.length;
        //for storing
      int [] ans = new int[nums.length];

        //two loops
        for(int i=0;i<n;i++){
            for(int j = i+1;j<n;j++){
                if(Math.abs(nums[i]-nums[j]) <= limit){
                  swap(nums,i,j);

                }
            }
        }
        System.arraycopy(nums,0,ans,0,n);
        return ans;

    }
  static    void swap(int [] nums,int i,int j){
        if(nums[i] > nums[j]) {
            int temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }

  }
}

