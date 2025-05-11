class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count1 = 0 ;
        int count2=0;

        for(int i = 0 ; i< nums.length;i++){
            if(nums[i] == 1){
                count1++;
                count2 = Math.max(count1, count2);

            }else{
                count1 =0;
                
            }
        }return count2;

        
    }
}

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
