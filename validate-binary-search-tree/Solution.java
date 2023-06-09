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
    public boolean isValidBST(TreeNode root) {
        return isValid(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public boolean isValid(TreeNode root, int low, int high) {
        if(root == null) return true;
        if(root.val < low || root.val > high) return false;
        if(root.val == Integer.MIN_VALUE && root.left != null) return false;
        if(root.val == Integer.MAX_VALUE && root.right != null) return false;
        return isValid(root.left, low, root.val-1) && isValid(root.right, root.val+1, high);
    }
}