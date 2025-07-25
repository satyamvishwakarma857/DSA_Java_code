package Q;

 // double ended queue -->

import java.util.Deque;
import java.util.LinkedList;

public class _5deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();


        //it has mainly 6 methods -->>

        // addLast method same as add method in queue -->>
        dq.addLast(4);

        //
        dq.addLast(6);

        System.out.println(dq);

        //
        dq.removeFirst();

        //
        dq.removeLast();
    }
}



