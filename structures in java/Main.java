import java.util.*;

public class Main {
    public static int sumen(int a, int b){
        int sum =a+b;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = sumen(a, b);
        System.out.println("sum :"+ sum);
        
    }
    
    public static void main(String[] args)  {
        int a= 30;
        int b =57;
        int add = sumen(a, b);
        System.out.println(add);
    }
}
