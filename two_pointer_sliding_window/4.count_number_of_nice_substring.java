class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return atmost(nums, k) - atmost(nums, k - 1);
    }
    
    public int atmost(int[] nums, int k) {
        int left = 0, result = 0, oddCount = 0;
        
        for (int right = 0; right < nums.length; right++) {
            // If nums[right] is odd, increase oddCount
            if (nums[right] % 2 != 0) {
                oddCount++;
            }
            
            // Shrink the window if the number of odd numbers exceeds k
            while (oddCount > k) {
                if (nums[left] % 2 != 0) {
                    oddCount--;
                }
                left++;
            }
            
            // Count the number of subarrays ending at 'right'
            result += right - left + 1;
        }
        
        return result;
    }
}
