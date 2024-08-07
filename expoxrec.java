package recursion;

public class expoxrec {
    
    public static void main(String[] args) {
        
        int x = 2;
        int n = 5;
        int ans = calpower(x,n);
        System.out.println(ans);
        
    }
    public static int calpower(int x, int n){

        
        if(n == 0){
            return 1;}
        if (n == 1){
            return x;
        }
        int xpown1 = calpower(x, n-1);
        int xpown = x*xpown1;
        return xpown;
    }
    }