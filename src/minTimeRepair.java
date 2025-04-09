import java.util.*;
public class minTimeRepair {
    public static void main(String[] args) {
      int[] arr = {4,2,3,1};
        System.out.println(repairCars(arr,10));
    }
    public static long repairCars(int[] ranks, int cars) {
    long left = 1;
    long right = (long) Arrays.stream(ranks).min().getAsInt()*cars*cars;
    long ans = right;
    while(left<=right){

        long mid = (left+right)/2;
        long cnt = 0;

        for(int i=0;i<ranks.length;i++){
            cnt += (long) Math.sqrt((double) mid /ranks[i]);
        }
        if(cnt >= cars){
            ans = mid;
            right = mid-1;
        }else{
            left = mid+1;
        }
    }
    return ans;
    }
}
