/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Tree_13{
    public int count=0;
    public int sumOfLeftLeaves(TreeNode root) {
        sum(root);
        return count;
    }
    public void sum(TreeNode root){
        if(root == null){
            return;
        }
        if(root.left!=null){
            if(root.left.left == null && root.left.right == null){
                count +=root.left.val;
            }
            else{
                sum(root.left);
            }
        }
        if(root.right!=null){
            sum(root.right);
        }
    }
}