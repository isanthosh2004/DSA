class Solution {
    public int numSubarraysWithSum(int[] nums, int goal)
{
    return atmost(nums , goal) - atmost(nums , goal -1);
}
    
    public int atmost(int[] nums, int goal) {
        int left = 0  , right = 0 ;
        int sum = 0  , result = 0;
        for(right = 0 ; right < nums.length;right++ ){
            sum += nums[right];
            while((sum >goal && left <= right)){
                sum -= nums[left];
                left++;

            }
            result += right - left +1;
        }
        return result ;
        
    }
}
