class Solution {
    public int removeDuplicates(int[] arr) {
            int j =1;
            for(int i = 0 ; i<arr.length-1;i++){
                
                if(arr[i] != arr[i+1]){
                    arr[j]= arr[i+1];
                    j++;
                }
            }
            return j;
        
    }
}
