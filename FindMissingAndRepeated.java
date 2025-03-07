import java.util.*;
public class FindMissingAndRepeated {
    public static void main(String[] args) {
    int[][] arr = {{1,3},{2,2}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(arr)));
    }
    public  static int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
    int missing = -1;
    int repeated = -1;
     HashMap<Integer,Integer> map = new HashMap<>();
    for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[i].length;j++){
            map.put(grid[i][j],map.getOrDefault(grid[i][j],0)+1);
        }
    }
 for(int num = 1;num <= n*n;num++){
     if(map.getOrDefault(num,0) == 2){
         repeated = num;
     }
     if(!map.containsKey(num)){
         missing = num;
     }
 }
      return new int[]{repeated,missing};
    }
}
