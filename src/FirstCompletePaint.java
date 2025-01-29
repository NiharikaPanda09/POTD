import java.util.*;
public class FirstCompletePaint {
    public static void main(String[] args) {
   int [][] mat = {{1,4},{2,3}};
   int [] arr = {1,3,4,2};
        System.out.println(firstCompleteIndex(arr,mat));
    }
    public static int firstCompleteIndex(int[] arr, int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
      HashMap<Integer,int[]> freq = new HashMap<>();

      for(int i=0;i<m;i++){
          for(int j=0;j<n;j++){
              freq.put(mat[i][j],new int[]{i,j});
          }
      }
       int [] rowcnt = new int[m];
      int [] colcnt = new int[n];

      for(int i=0;i<arr.length;i++){
          int curr = arr[i];
          int [] pos = freq.get(curr);
          int row = pos[0],col = pos[1];

          rowcnt[row]++;
          colcnt[col]++;

          if(rowcnt[row] == n || colcnt[col] == m){
              return i;
          }
      }

    return  -1;

    }
}
