class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] index = new int[128];
        int maxLength = 0;
        int start = 0; 

        for (int end = 0; end < s.length(); end++) {
            char currentChar = s.charAt(end);

          
            start = Math.max(start, index[currentChar]);

            
            maxLength = Math.max(maxLength, end - start + 1);

            
            index[currentChar] = end + 1;
        }

        return maxLength;
    }
}
