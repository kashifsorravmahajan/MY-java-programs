package string;

public class Samuel {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("tomy");
        System.out.println(sb);

        sb.setCharAt(0,'j');
        System.out.println(sb);
        sb.delete(2,3);
        System.out.println(sb);
        //System.out.println(sb.reverse);
    }
    
}
