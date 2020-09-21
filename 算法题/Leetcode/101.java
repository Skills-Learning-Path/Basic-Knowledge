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
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        else return isSame(root.left,root.right);
    }
    public boolean isSame(TreeNode left, TreeNode right){
        if(left==null&&right==null) return true;
        else if(left!=null&&right!=null&&left.val!=right.val) return false;
        else if(left!=null&&right!=null)
            return isSame(left.left,right.right)&&isSame(left.right,right.left);
        else return false;
    }
}
