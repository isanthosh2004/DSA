class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0 ;
        int[] charcount = new int[3];
        int left = 0; 
        for(int right = 0 ;right < s.length() ; right++){
            charcount[s.charAt(right)-'a']++;
            while(charcount[0]>0 && charcount[1]>0 && charcount[2]>0 ){
                count += s.length()- right;
                charcount[s.charAt(left)-'a']--;
                left++;
            }
        }
        
        return count;
    }
}
