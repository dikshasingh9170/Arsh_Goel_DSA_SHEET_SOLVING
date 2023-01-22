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
class Tree_9 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        DFS(root,"",list);
        return list ;
    }
    public void DFS(TreeNode root , String ans , List<String> list){
        if(root == null){
            return ;
        }
        if(root.left==null && root.right==null){
            list.add(ans+root.val);
            return ;
        }
    DFS(root.left,ans+root.val+"->",list);
    DFS(root.right,ans+root.val+"->",list);
    }
}
