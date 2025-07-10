package conditionals;
import java.util.Scanner;
public class ifElse
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the no: ");
        int a = sc.nextInt();
        System.out.print("the absolute value is : ");
        if (a>=0){
            System.out.print(a);
        }
        else {
            System.out.println(-a);
        }

    }
}
//