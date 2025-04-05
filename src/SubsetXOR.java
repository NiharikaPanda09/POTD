import java.util.*;
public class SubsetXOR {
    public static void main(String[] args) {
  int [] nums = {1,3};
        System.out.println(subsetXORSum(nums));
    }
    public static int subsetXORSum(int[] nums) {
    return back(0,nums,0);
    }
    private static int back(int ind,int[] nums,int curr){
        //base case
        if(ind == nums.length) return curr;
        //notpick
        int notpick = back(ind+1,nums,curr);

        int pick = back(ind+1,nums,curr^nums[ind]);

        return notpick+pick;
    }
}
