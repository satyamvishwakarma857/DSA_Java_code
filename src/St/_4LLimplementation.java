package St;

public class _4LLimplementation {

    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

    public static class Stack{
        private Node head = null;
        private int size = 0;

        //push method -->>
        void push(int val){
            Node temp = new Node(val);
            temp.next = head;
            head = temp;
            size++;

        }

        //pop method
        int pop(){
            if(head==null) {
                System.out.println("stack is empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }

        //peek method -->>
        int peek(){
            if(head==null) {
                System.out.println("stack is empty");
                return -1;
            }
            return head.val;
        }
        void displayRec(Node h){
            if(h==null) return;
            displayRec(h.next);
            System.out.print(h.val+" ");
        }

        //display method -->>
        void display(){
            displayRec(head); // calling displayRec method
            System.out.println();
        }
        int size(){
            return size;
        }

        // isEmpty method-->>
        boolean isEmpty(){
            if(size==0) return true;
            return false;


        }




    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(5);
        st.push(7);
        st.push(9);
        st.push(2);
        st.push(1);
        st.push(12);
        st.display();




        st.pop();
        st.display();
        st.push(78);


        st.display();

        System.out.println(st.size());
        System.out.println(st.peek());
        // System.out.println(sb.pop());
        st.display();



    }
}
