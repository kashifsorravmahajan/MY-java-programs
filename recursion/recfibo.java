package recursion;

public class recfibo {
    public static void main(String[] args) {
        int a = 0, b = 1;
        int n = 25;
        // Start recursion to print Fibonacci numbers
        recfibo(a, b, n - 2); // We start with n-2 because the first two numbers are already a and b
    }

    public static void recfibo(int a, int b, int n) {
        if (n < 0) {
            return; // Base case: If n is less than 0, exit the recursion
        }
        
        int c = a + b;
        System.out.println(c); // Print the next Fibonacci number
        
        // Recursive call with updated values
        recfibo(b, c, n - 1);
    }
}
