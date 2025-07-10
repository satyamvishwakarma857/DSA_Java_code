package Recursion_1;

public class _1printNaturalNO {

    // print decrease no from n to 1 -->
    public static void printdecrease(int n){
        //base case
        if(n==0) return;

        //self work -->
        System.out.print(n+" ");

        // recursive work
        printdecrease(n-1);
    }



    // print increase no from 1 to n -->
    public static void printIncrese(int n){
        //base case
        if(n==0) return;

        // recursive work
        printIncrese(n-1);

        //self work -->
        System.out.print(n+" ");
    }

    public static void main(String[] args) {
        int n;
        printIncrese(12); // increase method calling
        printdecrease(13); // decrease method calling
    }
}
