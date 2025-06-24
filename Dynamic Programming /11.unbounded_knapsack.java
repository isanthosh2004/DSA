class Solution {
    public int knapSack(int W, int[] wt, int[] val, int n) {
        // dp array where dp[i] will store the maximum value for capacity i
        int[] dp = new int[W + 1];

        // Initialize dp[0] = 0 (If the bag capacity is 0, the value is 0)
        dp[0] = 0;

        // Iterate over all the capacities from 1 to W
        for (int w = 1; w <= W; w++) {
            // For each item, check if we can include it and maximize the value
            for (int i = 0; i < n; i++) {
                // If the current item's weight is less than or equal to current capacity w
                if (wt[i] <= w) {
                    dp[w] = Math.max(dp[w], dp[w - wt[i]] + val[i]);
                }
            }
        }

        // The last value in dp array will store the result
        return dp[W];
    }
}
