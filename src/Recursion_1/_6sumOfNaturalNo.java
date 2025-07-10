package recursion2;

public class _6sumOfNaturalNo {
    public static int sum(int n){
        if(n==0) return 0;
        return sum(n-1)+n;
    }

    public static void main(String[] args) {
        int n;
        System.out.println(sum(4));
    }
}
