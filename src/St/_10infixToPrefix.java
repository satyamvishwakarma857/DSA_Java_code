package St;

import java.util.Stack;
// code is same as infixEvaluation bs isme val calculate krke stack me push nhi krna use as a preix String stack me push krna hai
public class _10infixToPrefix {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6"; //infix expression
        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            int value = (int)ch;
            if(value>=48 && value<=57){ //0 to 9
                String temp = "";
                val.add(temp+(value-48));


            }
            else if(op.size()==0 || ch == '(' || op.peek()=='(') op.push(ch);
            else if (ch==')'){
                while(op.peek()!='('){
                    String val2 = val.pop();
                    String val1 = val.pop();
                    val.push(op.peek()+val1+val2);
                    op.pop();

                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    //work
                    while(op.size()>0 && op.peek()!= '(') { // raghav sir ne ye while loop nhi lgaya h jiske karan unka code kuchh particular ex pr nhi chlta like "2*5/2+3-2*8+5/5"
                        String val2 = val.pop();
                        String val1 = val.pop();
                        val.push(op.peek()+val1+val2);
                        op.pop();
                    }
                    //push
                    op.push(ch);
                }
                else if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        //work

                        String val2 = val.pop();
                        String val1 = val.pop();
                        val.push(op.peek()+val1+val2);
                        op.pop();
                        //push
                        op.push(ch);

                    }
                    else op.push(ch);

                }
            }

        }
        while(val.size()>1){
            String val2 = val.pop();
            String val1 = val.pop();
            val.push(op.peek()+val1+val2);
            op.pop();



        }
        System.out.println(val.peek());


    }
}
