package oops;
import java.util.*;
class AddNo{
    public int add(int a, int b){
        int x = a+b;
        return x;
    }

}



public class addTwoNoByMethod {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        AddNo obj = new AddNo();
        System.out.println("the sum of two no is "+obj.add(a,b));



    }


}
