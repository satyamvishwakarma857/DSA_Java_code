package recursion2;

public class _4SumOfDigit {

    //method sum of digit -->

    public static int printSum(int n){
        if(n>=0 && n<=9){
            return n;
        }
          return printSum(n/10)+n%10;
    }

    // method count of digit -->
    public static int countno(int n){
         if(n>=0 && n<=9){
            return 1;
         }
           return countno(n/10)+1;
    }

    public static void main(String[] args) {


        System.out.println(printSum(72)); //1st method

        System.out.println(countno(0)); // 2nd method
    }
}
