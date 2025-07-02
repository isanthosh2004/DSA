class Solution {
    public int findCircleNum(int[][] ic) {
        int n = ic.length;
        boolean[] vs = new boolean[n];
        int p = 0;

        for (int i = 0; i < n; i++) {
            if (!vs[i]) {
                p++;
                dfs(ic, vs, i);
            }
        }

        return p;
    }

    private void dfs(int[][] ic, boolean[] vs, int ci) {
        vs[ci] = true;
        for (int i = 0; i < ic.length; i++) {
            if (ic[ci][i] == 1 && !vs[i]) {
                dfs(ic, vs, i);
            }
        }
    }
}
