import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] n = {3,5,6,8,1,0,20};
        int max =n[0]
        
        for(int i = 0 ; i<n.length;i++){
            if(n[i]> max){
                max = n[i];
            }
            
        }
        
        System.out.println(max);
    }
}
