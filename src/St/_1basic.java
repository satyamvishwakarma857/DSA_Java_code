package St;
// stack follow LIFO(last in first out) or FILO property
// stack ko jb fn me pass kiya jata h to pass by reference hota hai


import java.util.Stack;

public class _1basic {
    public static void main(String[] args) {

        //initialization --> same like arraylist
        Stack<Integer> st = new Stack<Integer>();


        //functions of stack

        //push fn --> TC -> O(1)
        st.push(2); // 2
        st.push(4); // 2 4
        st.push(6); // 2 4 6
        st.push(12); // 2 4 6 12
        st.push(9);  //2 4 6 12 9 (now element 9 is on the top of the stack)

        //print fn -->
        System.out.println(st); //stack ko sout ke andr dalo wah poora stack ke element ko print kr dega

        //POP fn ->> TC -> O(1)
        st.pop(); // it will pop(delete from the stack) the top most element of the stack ...

        System.out.println(st);

        // peek fn -->> TC -> O(1)
        System.out.println(st.peek());  // it will print the top most element of the stack ....

        //size fn -->>
        System.out.println(st.size()); // size() return the size(int val) of the stack ..





    }
}
