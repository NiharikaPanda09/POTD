
import java.util.*;
public class RedundantConnection {
    public static void main(String[] args) {
    int [][] arr = {{1,2},{1,3},{2,3}};
        System.out.println(Arrays.toString(findRedundantConnection(arr)));
    }
    static class DSU {
        int[] parent, rank;

        public DSU(int n) {
            parent = new int[n + 1];
            rank = new int[n + 1];

            for (int i = 0; i <=n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }

        public int find(int u) {
            if (u != parent[u]) {

                parent[u] = find(parent[u]);
            }
            return parent[u];

        }

        public boolean union(int u, int v) {
            int ul_u = find(u);
            int ul_v = find(v);

            if (ul_u == ul_v) return false;

            if (rank[ul_u] < rank[ul_v]) {
                parent[ul_u] = ul_v;
            } else if (rank[ul_v] < rank[ul_u]) {
                parent[ul_v] = ul_u;
            } else {
                parent[ul_v] = ul_u;
                rank[ul_u]++;
            }
            return true;
        }
    }
        public static int[] findRedundantConnection(int[][] edges) {
         int n = edges.length;
         DSU dsu = new DSU(n);

         for(int [] edge:edges){
             if(!dsu.union(edge[0],edge[1])){
                 return edge;
             }
         }
         return new int[0];
        }


}

import java.util.*;
public class RedundantConnection {
    public static void main(String[] args) {
    int [][] arr = {{1,2},{1,3},{2,3}};
        System.out.println(Arrays.toString(findRedundantConnection(arr)));
    }
    static class DSU {
        int[] parent, rank;

        public DSU(int n) {
            parent = new int[n + 1];
            rank = new int[n + 1];

            for (int i = 0; i <=n; i++) {
                parent[i] = i;
                rank[i] = 1;
            }
        }

        public int find(int u) {
            if (u != parent[u]) {

                parent[u] = find(parent[u]);
            }
            return parent[u];

        }

        public boolean union(int u, int v) {
            int ul_u = find(u);
            int ul_v = find(v);

            if (ul_u == ul_v) return false;

            if (rank[ul_u] < rank[ul_v]) {
                parent[ul_u] = ul_v;
            } else if (rank[ul_v] < rank[ul_u]) {
                parent[ul_v] = ul_u;
            } else {
                parent[ul_v] = ul_u;
                rank[ul_u]++;
            }
            return true;
        }
    }
        public static int[] findRedundantConnection(int[][] edges) {
         int n = edges.length;
         DSU dsu = new DSU(n);

         for(int [] edge:edges){
             if(!dsu.union(edge[0],edge[1])){
                 return edge;
             }
         }
         return new int[0];
        }


}

