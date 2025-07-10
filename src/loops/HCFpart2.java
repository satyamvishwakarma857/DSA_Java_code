package loops;
import java.util.Scanner;
public class HCFpart2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int i=y;
        while (x%i!=0){
            x=y;
            y=x%y;
        }
        System.out.println("hcf is "+y);
    }
}
