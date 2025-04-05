import java.util.*;
public class CountIsland {
    public static void main(String[] args) {
char [][] grid = {{'L', 'L', 'W', 'W', 'W'}, {'W', 'L', 'W', 'W', 'L'},
        {'L', 'W', 'W', 'L', 'L'},
        {'W', 'W', 'W', 'W', 'W'}, {'L', 'W', 'L', 'L', 'W'}};
        System.out.println(countIslands(grid));

    }
    public static int countIslands(char[][] grid) {
        if(grid == null || grid.length == 0) return 0;
        int row = grid.length;
        int col = grid[0].length;
        boolean[][] vis = new boolean[row][col];
        int cnt =0;
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                if(grid[i][j] == 'L' && !vis[i][j]){
                    bfs(grid,vis,i,j);
                    cnt++;
                }
            }
        }
        return cnt;

    }
    private static void bfs(char[][] grid,boolean[][] vis,int i,int j){
        int [][] dirs =  {{1,0},{-1,0},{0,1},{0,-1},{-1,-1}, {-1,1}, {1,-1}, {1,1}};
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});



        vis[i][j]=true;
        while(!q.isEmpty()){
            int[] curr = q.poll();
            int u= curr[0];
            int v = curr[1];
            for(int[] dir:dirs){
                int newX = u+dir[0];
                int newY = v+dir[1];

                if(isValid(grid,vis,newX,newY)){
                    q.add(new int[]{newX,newY});
                    vis[newX][newY] = true;
                }
            }

        }
    }
    private static boolean isValid(char[][]grid,boolean[][]vis,int x,int y){
        return  x>=0 && x< grid.length && y>=0 && y<grid[0].length &&
            grid[x][y] == 'L' && !vis[x][y];

    }
}
