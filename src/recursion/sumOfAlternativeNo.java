package recursion;

public class sumOfAlternativeNo {
    public static int printsum(int n){
        if(n==0) return 0;
        if(n%2==0){
          return  printsum(n-1)-n;
        }else{
           return printsum(n-1)+n;
        }
    }

    public static void main(String[] args) {
        System.out.println(printsum(6));
    }

}
