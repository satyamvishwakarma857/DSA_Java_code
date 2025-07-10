package loops;

import java.util.Scanner;

public class theSumOfFirstNnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int sum = 0;
        int n = sc.nextInt();
        for (int count = 1; count <= n; count++) {
            sum = sum+ count;
        }
        System.out.println(sum);

    }
}
