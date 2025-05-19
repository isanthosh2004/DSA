class Solution {
    public int search(int[] nums, int target) {
        return search(nums, target,0,nums.length-1);
        

    }
    int search(int[] arr, int target, int start,int end){
        if(start>end) return -1;
        int mid = start+(end-start)/2;
        if(arr[mid] == target) return mid;
        if(target<arr[mid]) {
            return search(arr, target, start, mid-1);
        }
        return search(arr, target, mid+1 , end);

    }
}

