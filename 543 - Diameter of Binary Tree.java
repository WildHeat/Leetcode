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
    int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return maxDiameter;
    }

    public int helper(TreeNode node){
        if (node == null) return 0;
        int maxLeft = helper(node.left);
        int maxRight = helper(node.right);
        int currDiameter = maxLeft + maxRight;
        maxDiameter = Math.max(maxDiameter, currDiameter);
        return 1 + Math.max(maxLeft, maxRight);
    }
}