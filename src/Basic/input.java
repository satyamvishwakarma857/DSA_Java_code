package Basic;
import java.util.Scanner;
public class input {
    public static void main(String[] args) {
        double r;
        Scanner cs = new Scanner(System.in);
        System.out.print("enter the radius:");
        r = cs.nextDouble();
        double pi = 3.14;
        double area = pi*r*r;
        System.out.println("the area of circle is :"+area);


    }
}
