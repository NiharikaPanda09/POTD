import java.util.*;
public class ProfitPath {
    public static void main(String[] args) {
    int [][] edges = {{0,1},{1,2},{1,3},{3,4}};
    int bob = 3;
     int [] amout = {-2,4,2,-4,6};
        System.out.println(mostProfitablePath(edges,bob,amout));
    }
    public static int mostProfitablePath(int[][] edges, int bob, int[] amount) {
        int n= amount.length;
        List<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++){
            graph[i] =  new ArrayList<>();
        }
        for(int[]edge:edges){
            graph[edge[0]].add(edge[1]);
            graph[edge[1]].add(edge[0]);
        }
        int[] bobTime = new int[n];
        Arrays.fill(bobTime,Integer.MAX_VALUE);
       trackBobPath(graph, bob, 0, -1, 0, bobTime);
        return dfsAlice(graph, 0, -1, 0, bobTime, amount);
    }
   public static boolean trackBobPath(List<Integer>[] graph,int node,int target,
                                      int parent,int time,int[] bobTime){
    bobTime[node] = time;
    if (node == target){
        return true;
    }
    for(int neigh:graph[node]){
        if(neigh!= parent && trackBobPath(graph, neigh, target, node, time + 1, bobTime)){
            return true;
        }
    }
    bobTime[node]  = Integer.MAX_VALUE;
    return false;
    }
    private static int dfsAlice(List<Integer>[] graph,int node,
                                int parent,int time,int[] bobTime,int[] amount){
        boolean isLeaf = true;
        int aliceProfit = amount[node];

        if(bobTime[node] < time) aliceProfit =0;
        else if (bobTime[node] == time) aliceProfit /=2;
            
        int maxProfit = Integer.MIN_VALUE;
        for(int neigh:graph[node]){
            if(neigh != parent){
              isLeaf = false;
              maxProfit = Math.max(maxProfit,dfsAlice(graph,neigh,node,time+1,bobTime,amount));
            }
        }
        return (isLeaf?0:maxProfit) + aliceProfit;

    }

}
