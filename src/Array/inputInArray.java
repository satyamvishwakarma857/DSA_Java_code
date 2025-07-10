package Array;
import java.util.Scanner;
public class inputInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        //for input
        for(int i=0;i<size;i++){
            numbers[i] = sc.nextInt();
        }
        //int m=78;
        for(int i=0;i<size;i++){
            if(numbers[i]==72){
                System.out.println(i);
            }
        }
    }
}
