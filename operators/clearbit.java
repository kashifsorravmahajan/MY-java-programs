package operators;

public class clearbit {
    
    public static void main(String[] args) {
        int a = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int notBitmask = ~(bitMask);

        int newNumber= notBitmask & a;
        System.out.println(newNumber);
    }
}
