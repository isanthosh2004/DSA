import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] n = {3,5,6,8,1,0,20};
        int t = n.length;
        int ss = secondsmall(n,t);
        int sm = secondmax(n,t);
        System.out.println(ss);
        System.out.println(sm);
        
        
    }
    public  static int secondsmall(int[] arr, int t){
        if (t<2) return -1;
        int small = Integer.MAX_VALUE;
        int secondsmall = Integer.MAX_VALUE;
        for(int i = 0 ; i<t;i++){
            if(arr[i]<small){
                secondsmall = small;
                small = arr[i];
            }else if(arr[i]<secondsmall && arr[i] !=small){
                secondsmall = arr[i];
            }
                
            
        }
        return secondsmall;
        
        
        
    }
     public  static int secondmax(int[] arr, int t){
         if (t<2) return -1;
         int large = Integer.MIN_VALUE;
         int secondlarge = Integer.MIN_VALUE;
         for(int i = 0 ; i<t; i++){
             if(arr[i]> large){
                 secondlarge = large;
                 large = arr[i];
             }else if(arr[i]> secondlarge && arr[i] != large){
                 secondlarge = arr[i];
             }
         }
         return secondlarge;
        
    }
}
