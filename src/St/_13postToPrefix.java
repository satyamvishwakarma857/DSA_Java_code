package St;

import java.util.Stack;
//postfix me left to right traverse krna hota hai -->>
public class _13postToPrefix {
    public static void main(String[] args) {
        String postfix = "953+4*6/-"; // postfix expression
        Stack<String> prefix = new Stack<>();
        for(int i=0;i<postfix.length();i++){
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                String temp = "";
                prefix.push(temp+(ascii-48));
            }
            else{
                String v2 = prefix.pop();
                String v1 = prefix.pop();
                prefix.push(ch+v1+v2);

            }

        }
        System.out.println(prefix.peek());
    }
}
