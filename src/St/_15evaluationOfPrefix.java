package St;

import java.util.Stack;

public class _15evaluationOfPrefix {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        Stack<Integer> value = new Stack<>();
        for(int i=prefix.length()-1;i>=0;i--){ // right to left traverse
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                value.push(ascii-48);

            }
            else{
                int val1 = value.pop(); // val1 phle pop hoga then val 2
                int val2 = value.pop();
                if (ch == '+') value.push(val1 + val2);
                else if (ch == '-') value.push(val1 - val2);
                else if (ch == '*') value.push(val1 * val2);
                else if (ch == '/') value.push(val1 / val2);
            }
        }
        System.out.println(value.peek());
    }
}
