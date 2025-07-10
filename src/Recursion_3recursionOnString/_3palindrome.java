package Recursion_3recursionOnString;

import java.util.Scanner;

public class _3palindrome {


    // reverse method
    static String reverse(String str,int idx){
        // base case
        if(idx==str.length())
            return "";

        // recursive work
        String smallAns = reverse(str,idx+1);

        //self work
        return smallAns+=str.charAt(idx);
    }


    // 2nd method (two pointer approach) isme string ko reverse krne ki jarrort nhi hai  -->
    static boolean reverse2(String str , int left ,int right){
        //base case
        if(left>=right){
            return true;

        }
        //self work
        if(str.charAt(left)!=str.charAt(right))
            return false;

        //recursive work--->
        return reverse2(str,left+1,right-1);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.println("enter string");
        String str = sc.nextLine();


        //calling 1st method (reverse method call krke  phir use original string se compare krna )
        String ans = reverse(str,0);
        if(str.equals(ans)){
            System.out.println("it is pallindrome");
        }
        else{
            System.out.println("it is not pallindrome");
        }


        // 2nd method calling
        System.out.println(reverse2(str,0,str.length()-1));



    }
}
