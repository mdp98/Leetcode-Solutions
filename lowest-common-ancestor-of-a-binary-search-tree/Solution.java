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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode node = p;
        if(p.val > q.val) {
            p = q;
            q = node;
        }
        node = root;
        while(node != null) {
            if(node == p || node == q) {
                return node;
            } else if (node.val > p.val && node.val < q.val) {
                return node;
            } else if (node.val > p.val && node.val > q.val) {
                node = node.left;
                continue;
            } else {
                node = node.right;
                continue;
            }
        }
        return null;
    }
}