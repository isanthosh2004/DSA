import java.util.Scanner;
public class Main{
    public static void generatebinarystring(int n , String current){
        if(current.length() == n){
            System.out.println(current);
            return;
        }
        generatebinarystring(n , current+"0");
        generatebinarystring(n , current+"1");
        
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        generatebinarystring(n,"");
        sc.close();
    }
}
