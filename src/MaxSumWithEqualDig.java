import java.util.*;
public class MaxSumWithEqualDig {
    public static void main(String[] args) {
       int [] arr = {18,43,36,13,7};
        System.out.println(maximumSum(arr));
    }
    public static int maximumSum(int[] nums) {
//         int max = 0;
//        for(int i=0;i<nums.length;i++){
//            for(int j=i+1;j<nums.length;j++){
//             if(DigitSum(nums[i]) ==  DigitSum(nums[j])){
//                 max = Math.max(max,nums[i]+nums[j]);
//             }
//            }
//        }
//        if(max>0)
//        return max;
//        else return -1;

        int max = -1;
        HashMap<Integer,Integer> map = new HashMap<>();
        // key is digit sum and val is num
        for (int num:nums) {
            int digit = DigitSum(num);

            if (map.containsKey(digit)){
                max = Math.max(max,num + map.get(digit));
                map.put(digit,Math.max(map.get(digit),num));
            }else{
                map.put(digit,num);
            }

        }
        return max;
    }
    public static int DigitSum(int num){
        int sum = 0;
        while(num >0){
            sum += num%10;
            num /= 10;
        }
        return sum;
    }
}
