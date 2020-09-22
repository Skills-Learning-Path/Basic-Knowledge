/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        if(root==null) return 0;
        dfs(root);
        return max;
    }

    public int dfs(TreeNode root){
        if(root.left==null&&root.right==null) return 0;
        else{
            int left=(root.left==null)?0:dfs(root.left)+1;
            int right=(root.right==null)?0:dfs(root.right)+1;
            max=Math.max(max,left+right);
            return Math.max(left,right);
        }
    }
}
