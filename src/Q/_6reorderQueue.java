package Q;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
// que -->> reorder the queue using a stack (no. of element in queue must be even )
public class _6reorderQueue {

    // method that reorder the queue -->>
    static void reorder(Queue<Integer> q){
        int n = q.size();

        Stack<Integer> st = new Stack<>();

        for(int i=1;i<=n/2;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
        }
        for(int i=1;i<=n/2;i++){
            st.push(q.remove());
        }
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }

        // reverse the queue -->>
        while(q.size()>0) st.push(q.remove());

        while(st.size()>0) q.add(st.pop());




    }


    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();

        //add fn --> TC -> O(1)  --> same as push fn
        q.add(1);
        q.add(3);
        q.add(5);
        q.add(7);
        q.add(9);
        q.add(11);
        q.add(13);
        q.add(15);
        System.out.println(q);
        reorder(q); // calling function
        System.out.println(q);
    }
}

 /*
    sir ne jo que kraye h leetcode wale unki list -->>

    225. implement stack using queue
    232. implement queue using stack
    GFG.     First negative in every window of size k
    aur dsa sheet wale que revise krne hai
     */
