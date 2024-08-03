
import java.util.Scanner;
//this is the code for matrix printing
public class joytwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] matrix= new int[n][m];
        for(int i =0;i<n;i++){
            for (int j =0;j<m;j++){
                matrix[i][j]=sc.nextInt();

            }
        }
        for(int i =0;i<n;i++){
            for (int j =0;j<m;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }//for searching any element in matrix
        for(int i =0;i<n;i++){
            for (int j =0;j<m;j++){
                if(matrix[i][j]==25){
                    System.out.print((i)+" "+(j));
                }
            }
        }
    }
    
}
