package string;

public class append {
    public static void main(String[] args) {
        
        StringBuilder sb = new StringBuilder("h");
        sb.append("e");
        sb.append("l");
        sb.append("L");
        sb.append("L");
        sb.append("O");
        
        System.out.println(sb);
        System.out.println(sb.length());
        for (int i = 0; i < sb.length()/2; i++){
            int front = i;
            int back = sb.length()-1-i;
            char frontChar = sb.charAt(i);
            char backChar = sb.charAt(back);
            sb.setCharAt(front, backChar);
            sb.setCharAt(back, frontChar);


        }  
        System.out.println(sb);
            } 
       //reversing the string

    }
    