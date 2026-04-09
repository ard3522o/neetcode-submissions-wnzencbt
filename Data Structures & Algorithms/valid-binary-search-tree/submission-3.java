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
   // Conceptual optimization
long lastValue = Long.MIN_VALUE; 

public boolean isValidBST(TreeNode root) {
    if (root == null) return true;
    
    // Check left
    if (!isValidBST(root.left)) return false;
    
    // Check current: Is it greater than the last thing we saw?
    if (root.val <= lastValue) return false;
    lastValue = root.val;
    
    // Check right
    return isValidBST(root.right);
}
}
