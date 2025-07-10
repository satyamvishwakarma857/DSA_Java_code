package Strings;
import java.util.Scanner;
//strings are immutable....................
public class stringDeclare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Declaration -->
//        String name = "tony";
//        String fullname = "tony stark";
//        String Sentence = "my name is tony stark";
//        System.out.println(Sentence);

        // input string from user -->
//        String name = sc.nextLine();
//        System.out.print("your name is : "+name);

        // concatenation -->
//        String firstname = "tony";
//        String lastname = "stark";
//        String fullname = firstname +" "+ lastname;
//        System.out.println("full name is "+fullname);

        //for finding length of a string -->
//        String firstname = "tony";
//        String lastname = "stark";
//        String fullname = firstname +" "+ lastname;
//        System.out.println("the length of the string is : "+fullname.length());

        // print every letter of a name -->
//        String firstname = "tony";
//        String lastname = "stark";
//        String fullname = firstname +" "+ lastname;
//        for(int i=0;i<fullname.length();i++) {
//            System.out.println(fullname.charAt(i));
//        }

        // compare two string-->
//        String name1= "tony";
//        String name2= "tony";
//        if(name1.compareTo(name2)==0) {
//            System.out.println("strings are equal ");
//        }
//            else{
//                System.out.println("strings are not equal ");
//            }

            // string me se substring nikalna -->
        String sentence = "tonystark";
            String name = sentence.substring(0,4);
            String name1 = sentence.substring(4,sentence.length());
        System.out.println(name);
        System.out.println(name1);
        }






    }


