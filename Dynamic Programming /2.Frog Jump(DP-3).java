// ---------- Minimal production code ----------
class FrogJump {
    public static int minEnergy(int[] h) {
        int n = h.length;
        if (n == 1) return 0;                     // already on top
        int prev2 = 0;                            // dp[0]
        int prev1 = Math.abs(h[1] - h[0]);        // dp[1]

        for (int i = 2; i < n; i++) {
            int jump1 = prev1 + Math.abs(h[i] - h[i - 1]); // 1-step
            int jump2 = prev2 + Math.abs(h[i] - h[i - 2]); // 2-step
            int cur   = Math.min(jump1, jump2);

            prev2 = prev1;    // slide window
            prev1 = cur;
        }
        return prev1;                             // dp[n-1]
    }
}
