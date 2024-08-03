
import java.util.*;

public class numbers {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter size of array :");
        int size= sc.nextInt();
        int numbers[]= new int[size];
        for(int i = 0; i<numbers.length;i++ ){
            numbers[i]=sc.nextInt();
            //System.out.print(numbers[i]);
        }
        for(int j = 0; j<size;j++ ){
            if(numbers[j]==25){
                System.out.println("the element is found at index:"+ (j+1));
            }
        }
    }
}
