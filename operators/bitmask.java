package operators;

public class bitmask {
    
    public static void main(String[] args) {
        int a = 4; //101
        int pos =2;
        int bitMask = 1 << pos;

        int newNumber = bitMask | a ;
        System.out.println(newNumber);

    }
}
