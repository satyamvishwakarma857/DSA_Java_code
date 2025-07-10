package conditionals;
import java.util.Scanner;
public class PRIMEorNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the no. : ");
        int n = sc.nextInt();
        int a =0;
        for(int i =2;i<n;i++) {
            if (n % i == 0) {
                a = 1;
                break;

            }
        }
            if (n == 1) {
                System.out.println("1 is not prime not composite.. ");
            }
                if (a == 0) {
                    System.out.println("no is prime.");

                } else {
                    System.out.println("no is not prime");
                }

            }
        }



