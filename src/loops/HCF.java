package loops;
import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int m = 1;
        for (int i = p; i >=1; i--) {
                if (p % i == 0 && q % i == 0) {
                    m = 0;
                    if (m == 0) {
                        System.out.println("the hcf is" + i);
                        return;
                    }

                }
            }



    }
}
