import java.util.*;
public class AlterGroupII {
    public static void main(String[] args) {
    int [] arr = {0,1,0,1,0};
    int k = 3;
        System.out.println(numberOfAlternatingGroups(arr,k));
    }
    public  static int numberOfAlternatingGroups(int[] colors, int k) {
       int l = 0;
       int n = colors.length;
       int cnt = 0;
        for(int r=1;r<n+k-1;r++){
          if(colors[r%n] == colors[(r-1)%n]){
              l = r;
          }
          if(r-l+1 >= k){
              cnt++;
          }
        }
          return cnt;


    }
}
