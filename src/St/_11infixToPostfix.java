package St;

import java.util.Stack;
// code is same as infixEvaluation bs isme val calculate krke stack me push nhi krna use as a preix String stack me push krna hai
public class _11infixToPostfix {
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
                    val.push(val1+val2+op.peek()); //  same as infixToPrefix bs yhi change hua h bs
                    op.pop();

                }
                op.pop();
            }
            else{
                if(ch=='+' || ch=='-'){
                    //work
                    while(op.size()>0 && op.peek()!= '(') {
                        String val2 = val.pop();
                        String val1 = val.pop();
                        val.push(val1+val2+op.peek()); // yaha bhi
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
                        val.push(val1+val2+op.peek()); // aur yaha bhi change hua bs
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
            val.push(val1+val2+op.peek());
            op.pop();



        }
        System.out.println(val.peek());

    }
}
