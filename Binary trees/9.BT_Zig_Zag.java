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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        boolean flag = true;
        if(root == null)  return result;
        q.offer(root);
        while(!q.isEmpty()){
            int level = q.size();
            Integer list[] = new Integer[level];
            for(int i = 0 ;i<level ;i++){
                TreeNode temp = q.poll();
                int idx = flag ? i : level -1-i;
                list[idx] = temp.val;
                if(temp.left != null ) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);

            }
            result.add(Arrays.asList(list));
            flag = !flag;

        }
        return result;
        
    }
}
