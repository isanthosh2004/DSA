class FrogJumpK {
    public static int minEnergy(int[] h, int K) {
        int n = h.length;
        int[] dp = new int[n];
        dp[0] = 0;

        for (int i = 1; i < n; i++) {
            int best = Integer.MAX_VALUE;
            for (int step = 1; step <= K && step <= i; step++) {
                int cost = dp[i - step] + Math.abs(h[i] - h[i - step]);
                if (cost < best) best = cost;
            }
            dp[i] = best;
        }
        return dp[n - 1];
    }
}
