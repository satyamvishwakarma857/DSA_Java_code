package Recursion_1;
import java.util.Scanner;

public class _2factorial {
    public static int factorial(int n){
        // Base case -->
        if(n==0){
            return 1;

        }
        // recursive work -->
        int m =factorial(n-1);

        //self work -->
        return n*m;
    }

    public static void main(String[] args) {

        System.out.println("Enter no :");
        int n = 6;
        System.out.println("Factorial is "+factorial(n));
    }
}
