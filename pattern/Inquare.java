import java.util.*;
public class Inquare {
    public static void main(String[] args) {
       int n=4;
       int m= 5;
       for (int i =1; i<=n;i++){
        for(int j =1;j<=m;j++){
            //cell(i,j)
            if(i==1 || j==1 || i== n-1 || j== m-1 ){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }

            
       }
       System.out.println(" ");
}
}
}