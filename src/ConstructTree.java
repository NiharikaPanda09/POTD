import java.util.*;
public class ConstructTree {
    public static void main(String[] args) {
    int [] pre = {1,2,4,5,3,6,9};
    int [] post = {4,5,2,6,7,3,1};
        TreeNode root = constructFromPrePost(pre, post);
        printInorder(root);
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


    static int preIdx, postIdx;

    public static TreeNode constructFromPrePost(int[] preorder, int[] postorder) {
        // Create the root node using the current preorder index
        TreeNode root=new TreeNode(preorder[preIdx]);
        preIdx++;

        // Construct the left subtree if the current node is not the postorder node
        if(root.val!=postorder[postIdx]){
            root.left=constructFromPrePost(preorder,postorder);
        }

        // Construct the right subtree if the current node is not the postorder node
        if(root.val!=postorder[postIdx]){
            root.right=constructFromPrePost(preorder,postorder);
        }

        // Move to the next postorder index
        postIdx++;

        return root;
    }
    public static void printInorder(TreeNode root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }
}
