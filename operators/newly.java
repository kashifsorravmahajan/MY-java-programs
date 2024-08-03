package operators;

public class newly {
    public static void main(String[] args) {
        int n = 5;
        int pos = 3;
        int bitMask = 1<< pos;
        if((bitMask & n)== 0){

            System.out.println(" yes ");
        }else{
            System.out.println("no");
        } 
        
        System.out.println("joy");
    }
    
}
