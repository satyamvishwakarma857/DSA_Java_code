package loops;
import  java.util.Scanner;
public class sumOfOddNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int sum = 0;
        int n = sc.nextInt();
        for (int count = 1; count <= n; count+=2) {
            sum = sum+ count;
        }
        System.out.println(sum);

    }

}
