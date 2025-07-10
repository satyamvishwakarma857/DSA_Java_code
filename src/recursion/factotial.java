package recursion;

public class factotial {
    public static void factorial(int n,int mult){
        if(n==0){
            System.out.println(mult);
            return;
        }
        mult=mult*n;
        factorial(n-1,mult);
    }
    public static void main(String[] args) {
        factorial(0,1);

    }
}

