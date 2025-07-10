package St;
//isme jitne bhi method h use maine ap se likhe hai bs sir ka approch se

import java.util.Stack;

public class _2variousMethods {

    //reverse stack recursive -->
    static void reverseRecursive(Stack<Integer> st){
        //base case
        if(st.size()==0) return;

        //recursive work
        int x= st.pop();
        reverseRecursive(st);

        //self work
        insert(st,0,x); // calling insert method
    }


    //reverse stack iterative
    static void reverse(Stack<Integer> st){
        Stack<Integer> temp = new Stack<Integer>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        Stack<Integer> temp2 = new Stack<Integer>();
        while(temp.size()>0){
            temp2.push(temp.pop());
        }

        while(temp2.size()>0){
            st.push(temp2.pop());
        }


    }

    // print method recursive -->
    static void printRecursive(Stack<Integer> st, int originalSize){

        // Base case
        if(st.size()==0) {

            return;

        }

        // recursive work
        int x = st.pop();
        printRecursive(st,originalSize);

        // self work

        System.out.print(x+" ");
        st.push(x);
        //ye condition h --> jb sare element print ho jaye to ek enter ho jaye
        if(st.size()==originalSize) System.out.println();

    }

    // print method iterative-->>
    static void printStack(Stack<Integer> st){
        Stack<Integer> temp = new Stack<Integer>();
        while(st.size()>0){
            temp.push(st.pop());
        }
        while(temp.size()>0){
            System.out.print(temp.peek()+" ");
            st.push(temp.pop());
        }
        System.out.println();



    }

    //insert at any index
    static void insert(Stack<Integer> st, int idx, int val){
        Stack<Integer> temp = new Stack<Integer>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(val);
        while(temp.size()>0){
            st.push(temp.pop());
        }

    }

    // remove from any idx -->
    static void remove(Stack<Integer> st, int idx){
        Stack<Integer> temp = new Stack<Integer>();
        while(st.size()>idx+1){
            temp.push(st.pop());
        }
        st.pop();
        while(temp.size()>0){
            st.push(temp.pop());
        }

    }


    // copy method -->> lekin ye original stack khali  kr dega
    static Stack<Integer> copyStack(Stack<Integer> st){
        Stack<Integer> temp = new Stack<Integer>();
        while(st.size()>0){
            temp.push(st.pop());
        }

        Stack<Integer> copiedStack = new Stack<Integer>();
        while(temp.size()>0){
            copiedStack.push(temp.pop());
        }
        return copiedStack;

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();

        //push fn --> TC -> O(1)
        st.push(2); // 2
        st.push(4); // 2 4
        st.push(6); // 2 4 6
        st.push(8); // 2 4 6 12
        st.push(10);  //2 4 6 12 9 (now element 9 is on the top of the stack)
        System.out.println(st);


        //copy method --> lekin ye original stack khali  kr dega
        //Stack<Integer> newCopy = copyStack(st);
        //System.out.println(newCopy);

        // insert method -->
        //insert(st,4,9);


        //print method iterative-->>
       // printStack(st);

        //print method recursive -->>
//        printRecursive(st, st.size());


        //remove from bottom/any idx
//        remove(st,0);


        //reverse stack iterative -->>
        //reverse(st);


        //reverse stack iterative -->>
        reverseRecursive(st);
        System.out.println(st);









    }
}
