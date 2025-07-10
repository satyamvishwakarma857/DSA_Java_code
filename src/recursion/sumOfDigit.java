package recursion;

public class sumOfDigit {
    public static int sumNo(int n){
        if(n>=0&&n<=9){
            return n;
        }
//        int smallans = sumNo(n/10);
//        int ans = sumNo(n%10);
        return  sumNo(n/10)+n%10;
    }

    public static void main(String[] args) {
        int n;
        System.out.println(sumNo(35445));

    }
}

