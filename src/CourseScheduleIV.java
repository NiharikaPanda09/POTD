
import java.util.*;
public class CourseScheduleIV {
    public static void main(String[] args) {
        int numCourses = 2;
        int [][] prerequisites = {{1,0}};
        int [][] queries = {{0,1},{1,0}};
        System.out.println(checkIfPrerequisite(numCourses,prerequisites,queries));
    }
    public  static List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        //1st creating boolean array
        boolean [][] isReachable = new boolean[numCourses][numCourses];

        //for loop for prerequisites array
        for(int[] preq:prerequisites){
            int from = preq[0];
            int to = preq[1];
            isReachable[from][to] = true;
        }


        //3 loop

        for(int k=0;k<numCourses;k++){
            for(int i=0;i<numCourses;i++){
                for(int j=0;j<numCourses;j++){
                    if(isReachable[i][k] && isReachable[k][j]){
                        isReachable[i][j] = true;
                    }
                }
            }
        }

        //returning boolean

        List<Boolean> res = new ArrayList<>();
        for(int []query:queries){
            int from = query[0];
            int to = query[1];
            res.add(isReachable[from][to]);
        }
        return res;
    }
}

import java.util.*;
public class CourseScheduleIV {
    public static void main(String[] args) {
        int numCourses = 2;
        int [][] prerequisites = {{1,0}};
        int [][] queries = {{0,1},{1,0}};
        System.out.println(checkIfPrerequisite(numCourses,prerequisites,queries));
    }
    public  static List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        //1st creating boolean array
        boolean [][] isReachable = new boolean[numCourses][numCourses];

        //for loop for prerequisites array
        for(int[] preq:prerequisites){
            int from = preq[0];
            int to = preq[1];
            isReachable[from][to] = true;
        }


        //3 loop

        for(int k=0;k<numCourses;k++){
            for(int i=0;i<numCourses;i++){
                for(int j=0;j<numCourses;j++){
                    if(isReachable[i][k] && isReachable[k][j]){
                        isReachable[i][j] = true;
                    }
                }
            }
        }

        //returning boolean

        List<Boolean> res = new ArrayList<>();
        for(int []query:queries){
            int from = query[0];
            int to = query[1];
            res.add(isReachable[from][to]);
        }
        return res;
    }
}

