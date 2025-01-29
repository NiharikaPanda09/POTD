import java.util.*;
public class NeighbourBitwiseXor {
    public static void main(String[] args) {
      int [] derived = {1,1,0};
        System.out.println(doesValidArrayExist(derived));
    }
    public static boolean doesValidArrayExist(int[] derived) {
        int n = derived.length;
      return isValid(derived,0,n) || isValid(derived,1,n);
    }
    public static boolean isValid(int [] derived,int start,int end){
        int n = derived.length;
        int[] original = new int[derived.length];
        original[0] = start;

        for(int i=1;i<n;i++){
            original[i] = derived[i-1] ^ original[i-1];
        }
        return (original[n-1]^original[0]) == derived[n-1];
    }
}
