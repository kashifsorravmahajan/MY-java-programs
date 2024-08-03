
import java.util.Scanner;

public class mul {
    public static void mul(int a, int b) {
        int c= a*b;
        System.out.println(c );
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        mul(a, b);
        
        int d = 67;
        int e = 35;
        mul(d, e);
    }
    
}
