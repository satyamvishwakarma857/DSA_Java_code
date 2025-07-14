package St;

import java.util.Stack;

public class _17prefixToInfix {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        Stack<String> value = new Stack<>();
        for(int i=prefix.length()-1;i>=0;i--){
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                value.push(ch+"");

            }
            else{
                String val1 = value.pop(); // val1 phle pop hoga then val2
                String val2 = value.pop();
                value.push("("+val1+ch+val2+")");
            }
        }
        System.out.println(value.peek());
    }
}
