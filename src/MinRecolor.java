import java.util.*;
public class MinRecolor {
    public static void main(String[] args) {
     String s = "WBBWWBBWBW";
     int k = 7;
        System.out.println(minimumRecolors(s,k));
    }
    public static int minimumRecolors(String blocks, int k) {
      int cnt = 0;
        int l = 0;
        int res = k;
        for(int r = 0; r<blocks.length(); r++){
            if(blocks.charAt(r) == 'W'){
                cnt ++;
            }
            if(r-l+1 == k){
                res = Math.min(res,cnt);
                if(blocks.charAt(l) == 'W'){
                    cnt--;

                }
                l++;

            }

        }
        return res;
    }
}
