import java.util.*;
public class LongFib {
    public static void main(String[] args) {
     int [] arr = {1,2,3,4,5,6,7,8};
        System.out.println(lenLongestFibSubseq(arr));
    }

    public static int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int max = 0;
        Map<Integer, Integer> map = new HashMap<>();
        int [][] dp = new int[n][n];

        for(int i=0;i<n;i++){
            map.put(arr[i],i);
        }
        for(int i = 0;i<n;i++){
            for(int j = i-1;j>=0;j--){
                int x = arr[j];
                int y = arr[i];
                int prev = y - x; // Required previous number

                // Check if prev exists and is before arr[j]
                if (prev < x && map.containsKey(prev)) {
                    int k = map.get(prev); // Index of prev in the array
                    dp[j][i] = dp[k][j] + 1;
                    max = Math.max(max, dp[j][i]);
                }else{
                    dp[j][i] = 2;
                }
            }
        }
        return max >= 3 ? max:0;
    }
}