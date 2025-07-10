package recursion;

public class fibonacci {
//    public static void fibonacci(int a, int b, int n){
//        if(n==0){
//            return;
//        }
//        int c= a+b;
//        System.out.println(c);
//        fibonacci(b, c, n-1);
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);

    }
    public static void main(String[] args) {
        int n = 7;
        fib(n);
        System.out.println(fib(n));


    }
}
