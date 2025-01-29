import java.util.*;
public class MapOfHighPeakBFS {
    public static void main(String[] args) {
  int[][] mat = {{0,0,1},{1,0,0},{0,0,0}};
        System.out.println(Arrays.deepToString(highestPeak(mat)));
    }
    public static int[][] highestPeak(int[][] isWater) {
        //1st
        int m = isWater.length;
        int n = isWater[0].length;

        int [][] height = new int[m][n];
        for(int i=0;i<m;i++){
            Arrays.fill(height[i],-1);
        }

        //2nd
        Queue<int[]> queue = new LinkedList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(isWater[i][j] == 1){
                    height[i][j] = 0;
                    queue.offer(new int[]{i,j});
                }
            }
        }
        //3rd
        int [][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};

        while(!queue.isEmpty()){
            int [] cell = queue.poll();
            int x = cell[0];
            int y = cell[1];


            for(int [] directions:dirs){
                int  nx = x +directions[0];
                int ny = y + directions[1];

                if(nx>=0 && nx<m && ny>=0 && ny<n && height[nx][ny] == -1){
                    height[nx][ny] = height[x][y] +1 ;
                    queue.offer(new int[]{nx,ny});
                }
            }
        }
        return height;
    }
}
