import java.util.Scanner;
public class Fact {
    public static void factuai(int n) {
        int k = 1;
        for (int i = n; i >= 1; i--) {
            k = k * i;
        }
        System.out.println(k);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factuai(n);
        sc.close();  // It's good practice to close the Scanner when done.
    }
}
