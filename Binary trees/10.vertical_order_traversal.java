class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        // col  →  list of {row, val}
        Map<Integer, List<int[]>> map = new TreeMap<>();
        Queue<Object[]> q = new LinkedList<>();          // {node,row,col}
        q.offer(new Object[]{root, 0, 0});

        while (!q.isEmpty()) {
            Object[] cur = q.poll();
            TreeNode n = (TreeNode) cur[0];
            int r = (int) cur[1], c = (int) cur[2];

            map.computeIfAbsent(c, k -> new ArrayList<>())
                .add(new int[]{r, n.val});

            if (n.left  != null) q.offer(new Object[]{n.left,  r + 1, c - 1});
            if (n.right != null) q.offer(new Object[]{n.right, r + 1, c + 1});
        }

        for (List<int[]> bucket : map.values()) {
            bucket.sort((a, b) -> a[0] != b[0] ? Integer.compare(a[0], b[0])
                                               : Integer.compare(a[1], b[1]));
            List<Integer> colVals = new ArrayList<>(bucket.size());
            for (int[] p : bucket) colVals.add(p[1]);
            ans.add(colVals);
        }
        return ans;
    }
}
