
class Solution {
    public int singleNumber(int[] nums) {
        int result =0 ;
        for(int i =0; i<nums.length;i++){
            result = result^nums[i];
        }
        return result;
    }
}


136. Single Number
Solved
Easy
Topics
Companies
Hint
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space
