import java.util.*;
public class MinOperation {
    public static void main(String[] args) {
      int [] nums ={2,11,10,1,3};
        System.out.println(minOperations(nums,10));
    }

    public static int minOperations(int[] nums, int k) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int num : nums) {
            pq.add(num);
        }
            int cnt = 0;
            while (pq.peek() < k) {
                int first = pq.poll();
                int second = pq.poll();
                int sum = Math.min(first, second) * 2 + Math.max(first, second);
                pq.add(sum);
                cnt++;
            }
            return cnt;

        }

    }

