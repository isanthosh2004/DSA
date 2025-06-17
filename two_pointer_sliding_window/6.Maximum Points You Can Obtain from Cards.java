class Solution {
    public int maxScore(int[] cardpoints, int k) {
        int n = cardpoints.length;
        int totalsum = 0;
        for(int card : cardpoints){
            totalsum += card;

        }
        int windowsum  = 0;
        for(int i =  0 ; i< n-k ;i++){
            windowsum += cardpoints[i];
        }
        int maxscore = totalsum -windowsum;
        for(int i = n-k ;i<n;i++){
            windowsum -= cardpoints[i-(n-k)];
            windowsum += cardpoints[i];
            maxscore = Math.max(maxscore , totalsum - windowsum);
        }
        
        return maxscore;
    }
}
