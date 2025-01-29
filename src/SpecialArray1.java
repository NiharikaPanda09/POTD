import java.util.*;
public class SpecialArray1 {
    public static void main(String[] args) {
      int []arr = {1,1,1,1};
        System.out.println(isArraySpecial(arr));
    }

    public static boolean isArraySpecial(int[] nums) {

        int n = nums.length;
        if (n == 1) return true;
        for (int i = 0; i < n - 1; i++) {
            if ((nums[i] % 2) == (nums[i + 1]) % 2) {
                return false;
            }

        }
        return true;
    }
}

