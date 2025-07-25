package LL;

public class _1basic {
    // it is a user defined class to create a node of linked list ->this is a blueprint in which 2 boxes are there . data type of 1st is int (named data)
    /// and data type of 2nd one is itself Node (named next)
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }
    // display method -- > ye sare linked list ke element ko print krega
    static void  display(Node temp ){
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
            

        }

    }

    public static void main(String[] args) {
        Node a = new Node(3); // a box will create named a   a
        // is node a ki kucch value bhi hoti h like LL._1basic$Node@4dd8dc3
        //example
        System.out.println(a);
        Node b = new Node(6); // a box will create named b   a b
        Node c = new Node(2); // a box will create named c   a b c
        Node d = new Node(9); // a box will create named d   a b c d

        // now we are connecting the boxes together -->
        a.next = b;  // a -> b  c  d
        b.next = c;  // a -> b ->  c  d
        c.next = d;  // a -> b -> c -> d

        // printing all the element manually
//        System.out.print(a.data+" ");
//        System.out.print(a.next.data+" "); // b = a.next
//        System.out.print(a.next.next.data+" "); //c = b.next = a.next.next
//        System.out.print(a.next.next.next.data);  //d = c.next = b.next.next = a.next.next.next

        // calling display method -->
        //display(b);
    }
}
