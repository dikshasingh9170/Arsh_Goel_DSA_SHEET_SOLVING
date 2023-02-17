import java.util.*;
class TreeNode {
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
public class Tree_13 {
    
    int minDiff = Integer.MAX_VALUE;
    TreeNode prev;
    
    public int getMinimumDifference(TreeNode root) {
        inorder(root);
        return minDiff;
    }
    
    public void inorder(TreeNode root) {
        if (root == null) return;
        inorder(root.left);
        if (prev != null) minDiff = Math.min(minDiff, Math.abs(root.val - prev.val));
        prev = root;
        inorder(root.right);
    }

}
