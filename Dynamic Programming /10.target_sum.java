class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        int n = nums.length;
        int mid = n/2;
        List<Integer> left = new ArrayList<>(1<< mid);
        List<Integer> right = new ArrayList<>(1<< (n-mid));
        computesum(nums , 0, mid, left);
        computesum(nums, mid, n, right);
        Map<Integer, Integer> freq = new HashMap<>();
        for(int s : right){
            freq.put(s,freq.getOrDefault(s,0)+1);
            
        }
        long total =0;
        for(int sleft : left){
            int need = target - sleft;
            total += freq.getOrDefault(need,0);

        }
        return (int) total;


        
    }
    private void computesum(int[] nums , int start, int end, List<Integer> out){
        out.add(0);
        for(int i = start ;i< end;i++){
            int val =nums[i];
            int size = out.size();
            for(int j = 0 ; j<size ;j++){
                int curr = out.get(j);
                out.set(j, curr-val);
                out.add(curr+val);
            }
        }
    }
}
