package Array;
import java.util.Scanner;
public class HomeworkPblm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[3];
        for(int i=0;i<3;i++){
            name[i]=sc.next();
        }
        for(int i=0;i<3;i++){
            System.out.println("name "+(i+1) +" is : " + name[i]);
        }
    }
}
