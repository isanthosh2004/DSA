class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        // If the start or target square is blocked, there is no path.
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
            return 0;

        int[][] dp = new int[m][n];      // dp[r][c] = ways to reach cell (r, c)
        dp[0][0] = 1;                    // start cell (guaranteed free by previous check)

        /* ---------- fill first row ---------- */
        for (int c = 1; c < n; c++) {
            if (obstacleGrid[0][c] == 0)          // only reachable if current square is free
                dp[0][c] = dp[0][c - 1];          // path is possible only from the left
            // else dp[0][c] remains 0
        }

        /* ---------- fill first column ---------- */
        for (int r = 1; r < m; r++) {
            if (obstacleGrid[r][0] == 0)
                dp[r][0] = dp[r - 1][0];          // only reachable from above
        }

        /* ---------- fill interior cells ---------- */
        for (int r = 1; r < m; r++) {
            for (int c = 1; c < n; c++) {
                if (obstacleGrid[r][c] == 0) {    // free square
                    dp[r][c] = dp[r - 1][c] + dp[r][c - 1];  // top + left
                }                                 // obstacle → dp[r][c] stays 0
            }
        }

        return dp[m - 1][n - 1];                  // bottom-right corner
    }
}
