import java.util.*;
public class CountServer {
    public static void main(String[] args) {
   int [][] arr = {{1,0},{0,1}};
        System.out.println(countServers(arr));
    }
    public static int countServers(int[][] grid) {
     int m = grid.length;
     int n = grid[0].length;
     int [] rowcnt = new int[m];
     int [] coln = new int[n];
     int cnt = 0;
     for(int i=0;i<m;i++){
         for(int j=0;j<n;j++){
            if(grid[i][j] == 1){
                rowcnt[i]++;
               coln[j]++;
               cnt++;
            }
         }
     }
     int isolate = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++) {
                if(grid[i][j] == 1 && rowcnt[i] == 1 && coln[j] == 1){
                    isolate++;
                }

            }
        }

          return cnt-isolate;
    }
}
