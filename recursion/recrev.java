package recursion;

public class recrev {
    
    public static void printrev(int m) 
    { 
        if (m==0){
            return;
        }
        System.out.println(m);
        printrev(m-1);
    }
    public static void main(String[] args) {
        
        int m =5;
        printrev(m);
    }
}
