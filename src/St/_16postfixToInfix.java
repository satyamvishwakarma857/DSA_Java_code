package St;

import java.util.Stack;

public class _16postfixToInfix {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        Stack<String> value = new Stack<>();
        for(int i=0;i<postfix.length();i++){
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                value.push(ch+"");

            }
            else{
                String val2 = value.pop(); // val2 phle pop hoga then val 1
                String val1 = value.pop();
                value.push("("+val1+ch+val2+")");
            }
        }
        System.out.println(value.peek());
    }
}
