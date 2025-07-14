package St;

import java.util.Stack;
// ye brackets () wale expression ko evalute kr skta h as well as normal expression ko bhi  
public class _9infixEvaluation2 {
    public static void main(String[] args) {
        System.out.println(9+8+(3+5*4-6)*6-4);
        String str = "(9+8+(3+5*4-6)*6-4)";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int value = (int)ch;
            if(value>=48 && value<=57){
                val.add(value-48);

            }
            else if(op.size()==0 || ch == '(' || op.peek()=='(') op.push(ch);
            else if (ch==')'){
                while(op.peek()!='('){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if (op.peek() == '+') val.push(val1 + val2);
                    else if (op.peek() == '-') val.push(val1 - val2);
                    else if (op.peek() == '*') val.push(val1 * val2);
                    else if (op.peek() == '/') val.push(val1 / val2);
                    op.pop();

                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    //work
                    while(op.size()>0 && op.peek()!= '(') { // raghav sir ne ye while loop nhi lgaya h jiske karan unka code kuchh particular ex pr nhi chlta like "2*5/2+3-2*8+5/5"
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if (op.peek() == '+') val.push(val1 + val2);
                        else if (op.peek() == '-') val.push(val1 - val2);
                        else if (op.peek() == '*') val.push(val1 * val2);
                        else if (op.peek() == '/') val.push(val1 / val2);
                        op.pop();
                    }
                    //push
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        //work

                        int val2 = val.pop();
                        int val1 = val.pop();
                        if(op.peek()=='*') val.push(val1*val2);
                        if(op.peek()=='/') val.push(val1/val2);
                        op.pop();
                        //push
                        op.push(ch);

                    }
                    else op.push(ch);

                }
            }

        }
        while(val.size()>1){
            int val2 = val.pop();
            int val1 = val.pop();
            if(op.peek()=='+') val.push(val1+val2);
            if(op.peek()=='-') val.push(val1-val2);
            if(op.peek()=='*') val.push(val1*val2);
            if(op.peek()=='/') val.push(val1/val2);
            op.pop();



        }
        System.out.println(val.peek());
    }
}
