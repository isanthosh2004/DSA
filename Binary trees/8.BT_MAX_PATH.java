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
    public int solve(TreeNode root, int[] maxi){
        if(root == null) return 0;
        int lsum = Math.max(0,solve(root.left,maxi));
        int rsum = Math.max(0,solve(root.right, maxi));
        maxi[0] = Math.max(lsum+rsum+root.val, maxi[0]);
        return root.val+ Math.max(lsum, rsum);
    }
    public int maxPathSum(TreeNode root) {
        int[] ans = new int[1];
        solve(root, ans);
        return ans[0];
        
    }
}
