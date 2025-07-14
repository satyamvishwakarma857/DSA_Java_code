package St;

import java.util.Stack;
//prefix wale me right to left traverse krna rhta hai -->>
public class _12prefixToPostfix {
    public static void main(String[] args) {
        String prefix = "-9/*+5346"; // prefix expression
        Stack<String> postfix = new Stack<>();
        for(int i=prefix.length()-1;i>=0;i--){
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String temp = "";
                postfix.push(temp+(ascii-48));
            }
            else{
                String v1 = postfix.pop();
                String v2 = postfix.pop();
                postfix.push(v1+v2+ch);

            }

        }
        System.out.println(postfix.peek());
    }
}
