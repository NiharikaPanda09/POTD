import java.util.*;
public class lca {
    public static void main(String[] args) {
   TreeNode root = new TreeNode(0);
   root.left = new TreeNode(1);
   root.right = new TreeNode(3);
   root.left.right = new TreeNode(2);
   TreeNode res = lcaDeepestLeaves(root);
        System.out.println(res.val);

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
    public static TreeNode lcaDeepestLeaves(TreeNode root) {
     int maxi= maxDepth(root);
     return dfs(root,maxi,0);

    }
    private static TreeNode dfs(TreeNode root,int maxi,int len){
        if(root == null) return null;
        if(maxi-1 == len) return root;

        TreeNode left = dfs(root.left,maxi,len+1);
        TreeNode right = dfs(root.right,maxi,len+1);

        if(left != null && right != null) return root;
        return left!=null ? left:right;
    }
    private static int maxDepth(TreeNode root){
        if(root == null){
            return 0;

        }else {
            return Math.max(maxDepth(root.left), maxDepth(root.right))+1;
        }
    }


}
