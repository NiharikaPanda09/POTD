import java.util.*;
public class PrefixCommonArray {
    public static void main(String[] args) {
     int[] a = {2,3,1};
     int[]b = {3,1,2};
        System.out.println(Arrays.toString(findThePrefixCommonArray(a, b)));
    }
    public static int[] findThePrefixCommonArray(int[] A, int[] B) {

//       HashMap<Integer,Integer> map = new HashMap<>();
//       for(int i:A){
//           map.put(i,map.getOrDefault(i,0)+1);
//       }
//       for(int j:B){
//           map.put(j,map.getOrDefault(j,0)+1);
//       }
//       int [] ans = new int[A.length];
//       int cnt = 0;
//        if(A.length > B.length || B.length > A.length){
//           cnt= 0;
//        }
//       for(int freq:map.values()){
//           if(freq >2){
//           cnt ++;
//           ans[freq] = cnt;
//           }
//       }
//       return ans;
        int n = A.length;
        int[] c = new int[n];
        int [] freq = new int[n+1];
        int cnt = 0;
        for(int i =0;i<n;i++){
            freq[A[i]]++;

            if(freq[A[i]] == 2){
                cnt++;
            }

            freq[B[i]]++;

            if(freq[B[i]] == 2){
                cnt++;
            }
            c[i] = cnt;
        }
        return c;
    }
}
