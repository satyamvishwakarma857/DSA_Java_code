package numberSystem;


import java.util.Scanner;

public class decimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter tre decimal no");
        int n = sc.nextInt();
        int sum = 0;
        int pw = 1;
        while(n>0){
            int r = n%2;
            sum =sum+( pw*r);
            pw = pw*10;
            n= n/2;
        }
        System.out.println("binary conversion is "+sum);


    }
}


