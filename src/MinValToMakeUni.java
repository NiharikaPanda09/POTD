import java.util.*;
public class MinValToMakeUni {
    public static void main(String[] args) {
    int [][] grid = {{2,4},{6,8}};
        System.out.println(minOperations(grid,2));
    }
    public static int minOperations(int[][] grid, int x) {

       int cnt = 0;
       ArrayList<Integer> list = new ArrayList<>();

       for(int[] row:grid){
           for(int num:row){
               list.add(num);
           }
       }
       Collections.sort(list);
       int size = list.size();
       int target = list.get(size/2);

       for(int el:list) {
           if (el % x != target % x) return -1;
           cnt += Math.abs(target-el)/x;

       }
       return cnt;
    }
}
