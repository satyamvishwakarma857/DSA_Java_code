package numberSystem;
import java.util.Scanner;

public class binaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int pw = 1;
        while(n>0){
            int unitDigit = n%10;
            unitDigit*=pw;
            sum+=unitDigit;
            pw*=2;
            n/=10;
        }
        System.out.println("decimal no is "+sum);
    }
}
