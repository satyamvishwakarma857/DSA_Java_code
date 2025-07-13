package St;

import java.util.Stack;

public class _8infixEvaluation {
    public static void main(String[] args) {
        System.out.println(2*5/2+3-2*8+5/5);
        String str = "2*5/2+3-2*8+5/5";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int value = (int)ch;
            if(value>=48 && value<=57){
                val.add(value-48);

            }
            else if(op.size()==0) op.push(ch);
            else{
                if(ch=='+' || ch=='-'){
                    //work
                    while(op.size()>0) { // raghav sir ne ye while loop nhi lgaya h jiske karan unka code kuchh particular ex pr nhi chlta like "2*5/2+3-2*8+5/5"
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
