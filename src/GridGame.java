import java.util.*;
public class GridGame {
    public static void main(String[] args) {
      int [][] grid = {{2,5,4},{1,5,1}};
        System.out.println(gridGame(grid));
    }
    public static long gridGame(int[][] grid) {
        long minSum = Long.MAX_VALUE;
        long rowSum1 = 0;
        for(int i=0;i<grid[0].length;i++){
            rowSum1 += grid[0][i];
        }
        int rowSum2 = 0;
        for(int i=0;i<grid[0].length;i++){
            rowSum1 -= grid[0][i];
            long max = Math.max(rowSum1,rowSum2);
            minSum = Math.min(minSum,max);
            rowSum2 += grid[1][i];
        }
         return minSum;
    }
}
