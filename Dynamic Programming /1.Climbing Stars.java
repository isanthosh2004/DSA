class Solution {
    public int climbStairs(int n) {
        int curr = 1 , prev = 1;
        if ( n == 1 || n == 0 ){
            return 1;
        }
        for(int i = 2 ;i<= n ;i++ ){
            int tem = curr;
            curr = prev + curr;
            prev = tem;
        }
        return curr;

        
    }
}
