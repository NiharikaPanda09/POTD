
import java.util.*;
public class MaxFishInGrid {
    public static void main(String[] args) {

        int[][] grid = {
                {0, 2, 1, 0},
                {4, 0, 0, 3},
                {1, 0, 0, 4},
                {0, 3, 2, 0}
        };

        System.out.println(findMaxFish(grid));

    }
    private static int row,col;
    private static boolean[][] vis;
    public  static int findMaxFish(int[][] grid) {
        row = grid.length;
        col = grid[0].length;

        vis = new boolean[row][col];
        int maxFish = 0;

        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                if(grid[i][j] >0 &&  !vis[i][j]){
                    maxFish = Math.max(maxFish,dfs(grid,i,j));
                }
            }
        }
        return maxFish;

    }
    public static int dfs(int[][] grid,int r, int c){
     //base case of index out of bounds and already visited
        if(r<0 || r>=row || c<0 || c>= col || grid[r][c] == 0 || vis[r][c]){
            return 0;
        }
        vis[r][c] = true;

        int FishCnt = grid[r][c];

        FishCnt += dfs(grid,r+1,c);
        FishCnt += dfs(grid,r-1,c);
        FishCnt += dfs(grid,r,c+1);
        FishCnt += dfs(grid,r,c-1);

        return FishCnt;
    }
}

import java.util.*;
public class MaxFishInGrid {
    public static void main(String[] args) {

        int[][] grid = {
                {0, 2, 1, 0},
                {4, 0, 0, 3},
                {1, 0, 0, 4},
                {0, 3, 2, 0}
        };

        System.out.println(findMaxFish(grid));

    }
    private static int row,col;
    private static boolean[][] vis;
    public  static int findMaxFish(int[][] grid) {
        row = grid.length;
        col = grid[0].length;

        vis = new boolean[row][col];
        int maxFish = 0;

        for(int i=0;i<row;i++){
            for(int j =0;j<col;j++){
                if(grid[i][j] >0 &&  !vis[i][j]){
                    maxFish = Math.max(maxFish,dfs(grid,i,j));
                }
            }
        }
        return maxFish;

    }
    public static int dfs(int[][] grid,int r, int c){
     //base case of index out of bounds and already visited
        if(r<0 || r>=row || c<0 || c>= col || grid[r][c] == 0 || vis[r][c]){
            return 0;
        }
        vis[r][c] = true;

        int FishCnt = grid[r][c];

        FishCnt += dfs(grid,r+1,c);
        FishCnt += dfs(grid,r-1,c);
        FishCnt += dfs(grid,r,c+1);
        FishCnt += dfs(grid,r,c-1);

        return FishCnt;
    }
}

