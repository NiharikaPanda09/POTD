import java.util.*;
public class PartitionAccToPivot {
    public static void main(String[] args) {
    int [] nums = {9,12,5,10,14,3,10};
        System.out.println(Arrays.toString(pivotArray(nums,10)));
    }
    public static int[] pivotArray(int[] nums, int pivot) {
// Input: nums = [9,12,5,10,14,3,10], pivot = 10
//Output: [9,5,3,10,10,12,14]

      ArrayList<Integer> less = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> greater = new ArrayList<>();
        for(int num:nums){
            if(num<pivot){
                less.add(num);
            } else if (num == pivot) {
                equal.add(num);
            }else {
                greater.add(num);
            }
        }
        int [] res = new int[nums.length];
        int ind = 0;
        for(int num:less) res[ind++] = num;
        for(int num:equal) res[ind++] = num;
        for(int num:greater) res[ind++] = num;
        return res;
    }
}
