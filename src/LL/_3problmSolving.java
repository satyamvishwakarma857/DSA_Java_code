package LL;

public class _3problmSolving {

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }


    static void  display(Node temp ) {
        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;

        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node a = new Node(3);
        Node b = new Node(3);
        Node c = new Node(3);
        Node d = new Node(3);
        Node e = new Node(3);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;


        display(a);



    }
}
/*
problems for revision -->
1. 237 	Delete Node in a Linked List
2.
3. 19 Remove Nth Node From End of List
4. 160 	Intersection of Two Linked Lists
5. 876 	Middle of the Linked List
6. 2095 Delete the Middle Node of a Linked List
7. 141  Linked List Cycle
8. 142  Linked List Cycle|| (ye wala thoda tricky hai)
9. MCQ
10. 21 -> O(n) space (Merge Two Sorted Lists) //
11. 21 -> O(1) space (Merge Two Sorted Lists) ye wala bhi mst que hai
12. 328 Odd Even Linked List
13. 83 	Remove Duplicates from Sorted List
14. 206 reverse linked list (recursive)
15. 206 reverse linked list (iterative)
16. 234 palindrome linked list
17. 2130 Maximum Twin Sum of a Linked List
18. 328 Odd Even Linked List
19.
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1;
        ListNode temp2 = l2;
        ListNode head = new ListNode(5);
        ListNode temp = head;
        boolean flag = false;
        while(temp1.next!=null && temp2.next!=null){
            int sum = temp1.val + temp2.val;
            if(sum<=9){
                if(flag){
                    ListNode a = new ListNode(sum+1);
                    if(sum+1<=9) flag = false;
                }
                else{
                    ListNode a = new ListNode(sum);
                }
                temp.next = a;
                temp = a;

                temp1 = temp1.next;
                temp2 = temp2.next;


            }

            else{
                if(flag){
                    ListNode a = new ListNode((sum+1)%10);


                }
                else{
                    ListNode a = new ListNode(sum%10);
                    flag = true;

                }
                temp.next = a;
                temp = a;
                temp1 = temp1.next;
                temp2 = temp2.next;



            }

        }


    }
}
 */