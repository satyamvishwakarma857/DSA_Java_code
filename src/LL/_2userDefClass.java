package LL;
//isme jitne bhi method h use maine ap se likhe hai bs sir ka approch se
public class _2userDefClass {

    // it is a user defined class to create a node of linked list ->this is a blueprint in which 2 boxes are there . data type of 1st is int (named data)
    /// and data type of 2nd one is itself Node (named next)
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }


    // user defined class of Linked List -->
    public static class linkedList {
        Node head = null;
        Node tail = null;

        // add method
        void add(int val) {
            Node temp = new Node(val);
            if (head == null) {//empty linked list
                head = temp;
                tail = temp;
            } else {
                tail.next = temp;
                tail = temp;

            }
        }

        // display method -- > ye sare linked list ke element ko print krega
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data+" ");
                temp = temp.next;

            }
            System.out.println();

        }

        // size method -->
        int size() {
            Node temp = head;
            int count = 0;
            while (temp != null) {
                count++;
                temp = temp.next;

            }
            return count;

        }

        //get method
        int get(int idx){
            if(idx>=size() || idx<0){
                System.out.print("invalid index"+" ");
                return -1;
            }

            Node temp = head;
            for(int i=1;i<=idx;i++){
                temp = temp.next;

            }
            return temp.data;


        }

        // delete method
        void delete(int idx){
            if(idx>size() || idx<0){ // invalid index is passed 
                System.out.println("invalid index");
                return;
            }
            if(idx==0){
                head = head.next;
                return;
            }
            Node temp = head;
            if(idx==size()-1){
                while(temp.next.next!=null){
                    temp = temp.next;

                }
                temp.next = null;
                tail = temp;
            }
            else {
                for(int i=1; i<=idx-1;i++){
                    temp = temp.next;
                }
                temp.next = temp.next.next;
            }
        }

        //insertAtHead method
        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head==null){ // empty list
                head = temp;
                tail = temp;

            }
            else { // non empty list -->
                temp.next = head;
                head =temp;
            }
        }

        //set method
        void set(int idx, int val){
            Node temp = new Node(val);
            if(idx>size() || idx<0){
                System.out.println("invalid index");
                return;
            }
            if(idx==0){
                insertAtHead(val);
            }
            else if(idx==size()){
                add(val);
            }
            else{
                int count = 0;
                Node a = head;
                while(a!=null){
                    a = a.next;
                    count++;
                    if(count == idx-1){
                        temp.next = a.next;
                        a.next = temp;
                        return;
                    }
                }


            }

        }

    }

    public static void main(String[] args) {
        linkedList l = new linkedList();
        l.add(5);
        l.add(8);
        l.add(45);
        l.add(33);
        l.add(9);
        //l.insertAtHead(8);
        //System.out.println(l.head.next);


//        l.size();
//        l.insertAtHead(67);
        //l.set(5,2);
//        System.out.println(l.tail.next);
        l.display();
        l.delete(2);
        l.display();

        System.out.println(l.head.data);
        System.out.println(l.tail.data);


//        System.out.println(l.size());




    }
}
