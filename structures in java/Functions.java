import java.util.Scanner;

public class Functions {
    // Method to print the provided name
    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
        
        // Prompt user for input
        System.out.print("Enter your name: ");
        
        // Read the input name
        String name = sc.next();
        
        // Call the method to print the name
        printMyName(name);
        
        // Close the Scanner object
        sc.close();
    }
}

