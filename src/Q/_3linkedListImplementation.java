package Q;

public class _3linkedListImplementation {

    public static class Node{
        int data;
        Node next;


        //constructor
        Node(int data){
            this.data = data;
        }
    }

    public static class Queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        void add(int val){
            Node a = new Node(val);
            if(head==null){
                head = a;
                tail = a;
                size++;
            }
            else{
                tail.next = a;
                tail = a;
                size++;

            }


        }

        int remove(){
            if(head==null){
                System.out.println("queue is empty");
                return -1;
            }
            int x = head.data;
            head = head.next;
            size--;
            return x;


        }

        int peek(){
            if(head==null){
                System.out.println("queue is empty");
                return -1;
            }

            return head.data;
        }

        int size(){
            return size;
        }

        boolean isEmpty(){
            if(size==0) return true;
            return false;
        }

        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }


    }



    public static void main(String[] args) {
        Queue q = new Queue();

        // add method-->>
        q.add(3);
        q.add(5);
        q.add(3);
        q.add(7);
        q.add(9);
        q.add(1);

        //displaymethod-->>
        q.display();

        //removemethod-->>
        q.remove();
        q.display();


        //peekmethod-->>
        System.out.println(q.peek());

        //sizemethod-->>
        System.out.println(q.size());

        //isEmptyMethod-->>
        System.out.println(q.isEmpty());


    }
}
