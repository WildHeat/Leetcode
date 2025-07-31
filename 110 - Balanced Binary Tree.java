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
class Solution {
    boolean isBalancedBoolean = true;
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return isBalancedBoolean;
    }

    private int helper(TreeNode node){
        if(!isBalancedBoolean || node == null) return 0;
        int leftDepth = helper(node.left);
        int rightDepth = helper(node.right);
        if(Math.abs(leftDepth - rightDepth) > 1){
            isBalancedBoolean = false;
            return 0;
        }
        return 1 + Math.max(leftDepth, rightDepth); 
    }
}