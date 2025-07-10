package recursion;

public class printSum1stNaturalNo {
    public static int printsum(int n) {
        if(n==0){
            return 0;
        }
        return printsum(n-1)+n;

    }

    public static void main(String[] args) {
        System.out.println( printsum(8));

    }
}


