package recursion2;

import java.util.Scanner;
// fibnacci no is --> 0 1 1 2 3 5 8 13 ..... cureent no = sum of previous two no

public class _3Fibonacco {
    public static int fib(int n){
        if (n==0||n==1)return n;
        return fib(n-1)+fib(n-2);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no :");
        int n = sc.nextInt();
        System.out.println(n+"th fibonacci no is "+fib(n));
    }
}
