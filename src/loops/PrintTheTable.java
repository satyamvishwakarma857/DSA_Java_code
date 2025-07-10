package loops;

import java.util.Scanner;

public class PrintTheTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number ");
        int n = sc.nextInt();
        for (int count = n; count <= n*10; count=  count+n) {
            System.out.println(count + " ");
        }
    }
}

