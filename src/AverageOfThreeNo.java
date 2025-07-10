import java.util.Scanner;
public class AverageOfThreeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter three numbers : ");
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        int avg = (a+b+c)/3;
        System.out.println("the avg of three numbers : "+avg);
    }

}
