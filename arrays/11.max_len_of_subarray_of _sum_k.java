two pointer approach 

import java.util.*;
public class Main{
    public static void main(String[] args){
        int[] arr = {2,3,5,1,9}
        long k =10;
        int len = longestsubarray(arr,n);
        System.out.println(len);
    }
    public static int longestsubarray(int[] arr, int k){
        int left =0 , right = 0;
        long sum =arr[0];
        int maxlen = 0;
        while(right<n){
            while(left <= right && sum >k){
                sum -=a[left];
                left++;
            }
            if(sum == k){
                maxlen = Math.max(maxlen, right-left+1);
                
            }
            right++;
            if(right<n){
                sum+=arr[right];
            }
        }
        return maxlen;
    }
}
