class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc = image[sr][sc];
        if(oc == color) return image;
        helper(image, sr,sc, color,oc);
        return image;
        
    }
    private void helper(int[][] image , int sr, int sc , int  color, int c){
        if(sr<0 || sc<0 || sr>= image.length || sc>= image[0].length || image[sr][sc] != c){
            return;
        }
        image[sr][sc]= color;
        helper(image, sr , sc-1, color, c);
        helper(image, sr , sc+1, color, c);
        helper(image, sr-1 , sc, color, c);
        helper(image, sr+1 , sc, color, c);
    }
}
