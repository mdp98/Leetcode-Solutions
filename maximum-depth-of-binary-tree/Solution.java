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
    int ans = 0;
    public int maxDepth(TreeNode root) {
        traverse(root, 1);
        return ans;
    }

    public void traverse(TreeNode root, int height) {
        if(root == null) {
            ans = Math.max(ans, height-1);
            return;
        }
        traverse(root.left, height+1);
        traverse(root.right, height+1);
    }
}