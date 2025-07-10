package conditionals;
import java.util.Scanner;
public class maxInThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter first no : ");
        int a = sc.nextInt();
        System.out.print("enter second no : ");
        int b = sc.nextInt();
        System.out.print("enter third no : ");
        int c = sc.nextInt();
        if(a>b){//b chhota h
            if (a>c){
                System.out.println(a+"is greatest");
            }
            else{
                System.out.println(c+"is gratest ");
            }

        }
        else  if(b>c){
            System.out.println(b+"is greatest");

        }
        else {
            System.out.println(c+" is gratest");
        }
    }
}


