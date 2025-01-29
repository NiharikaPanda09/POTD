import java.util.*;
public class minPathGraph {
    public static void main(String[] args) {
        int[][] grid = {{1, 1, 1, 1}, {2, 2, 2, 2}, {1, 1, 1, 1}, {2, 2, 2, 2}};
        System.out.println(minCost(grid));
    }
    public  static int minCost(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

        Deque<int[]> deque = new ArrayDeque<>();
        int[][] cost = new int[m][n];

        for (int[] row : cost) {
            Arrays.fill(row, Integer.MAX_VALUE);
            cost[0][0] = 0;
        }
        deque.offer(new int[]{0,0});

        while(!deque.isEmpty()){
            int [] curr = deque.pollFirst();
            int x = curr[0];
            int y = curr[1];


            for(int d=0;d<4;d++){
                int nx = x + directions[d][0];
                int ny = y + directions[d][1];
                int newcost = cost[x][y] + (grid[x][y] == d+1?0:1);

                if(nx >=0 && ny >= 0 && nx<m && ny<n &&  newcost < cost[nx][ny]){
                    cost[nx][ny] = newcost;
                    if(grid[x][y] == 1){
                        deque.offerFirst(new int[]{nx,ny});
                    }else{
                        deque.offerLast(new int[]{nx,ny});
                    }
                }
            }
        }
        return cost[m-1][n-1];
    }


}
