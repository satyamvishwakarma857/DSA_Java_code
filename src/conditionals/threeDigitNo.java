package conditionals;
import java.util.Scanner;

public class threeDigitNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("print the number : ");
        int a = sc.nextInt();
        if(a%5==0 || a%3==0){
            if(a%15!=0){
                System.out.println("the no is divisible by 5 or 3 but not 15");
            }
            else{
                System.out.println("the condition is not true");
            }
        }
        else{
            System.out.println("the number is not divisible by 5 or three ");

        }

    }
}
