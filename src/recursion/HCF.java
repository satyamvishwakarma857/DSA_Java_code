package recursion;
import java.util.Scanner;
public class HCF {
    public static int printhcf(int x,int y){
        while(x%y!=0){
            int rem = x%y;
            x=y;
            y=rem;
        }
        return y;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
        System.out.println("hcf is "+printhcf(x,y));
    }


}
