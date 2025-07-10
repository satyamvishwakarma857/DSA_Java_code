import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the mark of sub1: ");
        float a = sc.nextFloat();
        System.out.println("enter the mark of sub2: ");
        float b = sc.nextFloat();
        System.out.println("enter the mark of sub3: ");
        float c = sc.nextFloat();
        System.out.println("enter the mark of sub4: ");
        float d = sc.nextFloat();
        System.out.println("enter the mark of sub5: ");
        float e = sc.nextFloat();
        float per = (a+b+c+d+e)/500*100;
        System.out.println("the percentage is :"+per);

    }
}
