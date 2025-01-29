import java.util.HashMap;

public class CntNoOfBadPairs {
    public static void main(String[] args) {

     int [] arr = {4,1,3,3};
        System.out.println(countBadPairs(arr));
    }
    public static long countBadPairs(int[] nums) {
//    long cnt = 0;
//    for(int i=0;i<nums.length;i++){
//        for(int j = 1;j<nums.length;j++){
//                if(i<j){
//                if((j-i) != (nums[j]-nums[i])) {
//                    cnt++;
//                }
//
//            }
//        }
//    }
//
//        return cnt;

        int n = nums.length;

        HashMap<Integer,Long> map = new HashMap<>() ;
        long totalPairs = (long) n * (n-1)/2;

        for(int i=0;i< nums.length;i++){
          int  diff = nums[i]-i;
          totalPairs -= map.getOrDefault(diff,0L);
          map.put(diff,map.getOrDefault(diff,0L)+1);
        }
            return totalPairs;

    }
}
