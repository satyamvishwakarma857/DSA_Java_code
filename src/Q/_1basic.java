package Q;

import java.util.LinkedList;
import java.util.Queue;

public class _1basic {
    public static void main(String[] args) {

        //initialization
        Queue<Integer> q = new LinkedList<>();

        //add fn --> TC -> O(1)  --> same as push fn
        q.add(1);
        q.add(3);
        q.add(5);
        q.add(7);
        q.add(9);
        q.add(11);
        
        System.out.println(q);


        //print fn -->
        System.out.println(q); //queue ko sout ke andr dalo wah poora queue ke element ko print kr dega

        //remove fn ->> TC -> O(1) same as POP fun
        q.remove(); // it will pop(delete from the queue the top most element of the queue ...

        System.out.println(q);

        // peek fn -->> TC -> O(1)
        System.out.println(q.peek());  // it will print the top most element of the queue ....

        //size fn -->>
        System.out.println(q.size()); // size() return the size(int val) of the queue ..

        System.out.println(q.isEmpty());



    }
}
