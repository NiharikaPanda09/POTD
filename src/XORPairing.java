import java.util.*;
public class XORPairing {
    public static void main(String[] args) {
     int [] num1 = {2,1,3};
     int [] num2 = {10,2,5,0};
        System.out.println(xorAllNums(num1,num2));
    }
    public static int xorAllNums(int[] nums1, int[] nums2) {
//        int res = 0;
//           for(int num1:nums1){
//               for(int num2:nums2){
//                   res ^= (num1^num2);
//               }
//
//           }
//           return res;
//    }

        int count = 0;
        int n = nums1.length;
        int m = nums2.length;

        if (n % 2 == 1) {
            for (int j = 0; j < m; j++) {
                count ^= nums2[j];
            }
        }
            if (m % 2 == 1) {
                for (int j =0;j<n;j++) {
                    count ^= nums1[j];
                }
            }

        return count;
    }
}
