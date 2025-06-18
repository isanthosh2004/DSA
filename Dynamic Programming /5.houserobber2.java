class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if (n == 1) return nums[0];                 // only one house
        if (n == 2) return Math.max(nums[0], nums[1]); // two houses → pick richer

        /* -------- case A: rob in range [0 .. n-2] (skip last house) -------- */
        int[] dpA = new int[n];                     // dpA[i] = best up to i (case A)
        dpA[0] = nums[0];
        dpA[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < n - 1; i++) {           // stop at n-2
            dpA[i] = Math.max(dpA[i - 1], nums[i] + dpA[i - 2]);
        }

        /* -------- case B: rob in range [1 .. n-1] (skip first house) -------- */
        int[] dpB = new int[n];                     // dpB[i] = best up to i (case B)
        dpB[1] = nums[1];                           // base for slice starting at 1
        for (int i = 2; i < n; i++) {               // run through last house
            dpB[i] = Math.max(dpB[i - 1], nums[i] + dpB[i - 2]);
        }

        /* answer = better of the two linear scenarios */
        return Math.max(dpA[n - 2], dpB[n - 1]);
    }
}
