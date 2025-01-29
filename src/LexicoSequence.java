import java.util.*;
public class LexicoSequence {
    public static void main(String[] args) {
   int n = 3;
        System.out.println(Arrays.toString(constructDistancedSequence(n)));
    }
    public static int[] constructDistancedSequence(int n) {
      int [] res = new int[ 2* n-1];
      boolean [] used = new boolean[n+1];
      backtrack(res,used,n,0);
      return res;

    }

    private static boolean backtrack(int[] res, boolean[] used, int n, int index) {
        while(index < res.length && res[index] != 0) {
            index++;
        }
        if(index == res.length) return true;

        for(int i=n;i>=1;i--){
            if(used[i]) continue;
            if(i==1){
                res[index] = 1;
                used[1] = true;
                if(backtrack(res,used,n,index+1)) return  true;
                res[index] = 0;
                used[1]= false;
            }else if(index + i < res.length && res[index + i] == 0){
               res[index] = i;
               res[index+i] = i;
               used[i] = true;
                if(backtrack(res,used,n,index+1)) return  true;
                res[index] = 0;
                res[index+i] = 0;
                used[i]=false;
            }
        }
        return false;
    }
}
