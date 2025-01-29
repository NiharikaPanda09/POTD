import java.util.*;
public class FindEleContaminated {
    public static void main(String[] args) {
     TreeNode root = new TreeNode(-1);
     root.right = new TreeNode(-1);
     FindElements findele = new FindElements(root);
        System.out.println(FindElements.find(2));
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
   static class FindElements {
       private static Set<Integer> values = new HashSet<>();
        public FindElements(TreeNode root) {
            if(root != null){
                root.val = 0;
                dfs(root);
            }
        }
       public void dfs(TreeNode node){
            if(node == null) return;
            values.add(node.val);

            if(node.left != null){
                node.left.val = 2 * node.val + 1;
                dfs(node.left);
            } else if (node.right != null) {
                node.right.val = 2* node.val +2;
                dfs(node.right);
            }
       }

        public static boolean find(int target) {
         return values.contains(target);
        }
    }
}
