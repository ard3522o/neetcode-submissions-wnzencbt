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
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }

    private boolean validate(TreeNode root, long min, long max) {
        if (root == null) return true;

        // ✅ Fix 1: null check gone (handled by base case above)
        // ✅ Fix 2: strict comparison with min/max boundaries
        // ✅ Fix 3: passing boundaries down instead of checking only immediate children
        if (root.val <= min || root.val >= max) return false;

        return isValidBST(root.left) && isValidBST(root.right);
    }
}