package recursion;

public class recursion1 {
    public static void printnum(int m){
        if(m==0){
            return;
        }
        System.out.println(m);
        printnum(m-1);
    }
    public static void main(String[] args) {
        int m = 5;
        printnum(m);
        

    }
    
}
