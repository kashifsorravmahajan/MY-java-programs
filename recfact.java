package recursion;

import java.util.Scanner;

public class recfact {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        float fact = factorialn(n);
        System.out.println(fact);
    }
    public static float factorialn( float n) {
        if (n==0 | n==1){
            return 1;
        }
        return n*factorialn(n-1);
    
    }
    
}
