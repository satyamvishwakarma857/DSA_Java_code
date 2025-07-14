package St;

import java.util.Stack;

public class _14evaluationOfPostfixExp {
        public static void main(String[] args) {
            String postfix = "953+4*6/-";
            Stack<Integer> value = new Stack<>();
            for(int i=0;i<postfix.length();i++){
                char ch = postfix.charAt(i);
                int ascii = (int)ch;
                if(ascii>=48 && ascii<=57){
                    value.push(ascii-48);

                }
                else{
                    int val2 = value.pop(); // val2 phle pop hoga then val 1
                    int val1 = value.pop();
                    if (ch == '+') value.push(val1 + val2);
                    else if (ch == '-') value.push(val1 - val2);
                    else if (ch == '*') value.push(val1 * val2);
                    else if (ch == '/') value.push(val1 / val2);
                }
            }
            System.out.println(value.peek());
        }
}

