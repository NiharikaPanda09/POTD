import java.util.*;
public class RemoveTree {
    public static void main(String[] args) {
   String s = "1-2--3--4-5--6--7";
   TreeNode root = recoverFromPreorder(s);
       printLevelOrder(root);
    }
    public static class TreeNode {
    int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
    public static TreeNode recoverFromPreorder(String traversal) {
        Stack<TreeNode> st = new Stack<>();
     int i=0;
     int n = traversal.length();
     while(i<n){
         int depth = 0;
         while (i < n && traversal.charAt(i) == '-') {

             depth++;
             i++;
         }
         //extracting node values
         int val = 0;
         while(i<n && Character.isDigit(traversal.charAt(i))){
             val = val*10 + (traversal.charAt(i) - '0');
             i++;
         }
         TreeNode node = new TreeNode(val);
         while(st.size() > depth){
             st.pop();
         }
         if(!st.isEmpty()){
             if(st.peek().left == null){
                 st.peek().left = node;
             }else{
                 st.peek().right = node;
             }

         }
         st.push(node);
     }
     while(st.size()>1){
         st.pop();
     }
     return st.peek();
    }
    public static void printLevelOrder(TreeNode root) {
        if (root == null) return;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");

            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        System.out.println();
    }
}
