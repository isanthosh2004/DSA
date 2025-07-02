class Solution {
    Set<Integer> hash = new HashSet<>();

    public boolean findTarget(TreeNode root, int k) {
        if(root == null ) return false;
        if(hash.contains(k-root.val)) return true;
        hash.add(root.val);
        return findTarget(root.left, k) || findTarget(root.right,k);
        
    }
}
