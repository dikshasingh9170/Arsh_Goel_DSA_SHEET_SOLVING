import java.util.*;
class TreeNode{
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
class Tree_5 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){
            return true;
        }
        return symm(root.left,root.right);
    }
    public boolean symm(TreeNode root1,TreeNode root2){
        if(root1==null && root2==null){
            return true;
        }
        else if(root1==null || root2==null){
            return false;
        }
        if(root1.val!=root2.val){
            return false;
        }
        return symm(root1.left,root2.right) && symm(root1.right,root2.left);
    }
}
