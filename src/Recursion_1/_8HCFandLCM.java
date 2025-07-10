package recursion2;

import java.util.Scanner;
public class _8HCFandLCM {

    // itrative method -->
    public static int printhcf(int x,int y){
        while(x%y!=0){
            int rem = x%y;
            x=y;
            y=rem;
        }
        return y;
    }
// 2nd method recursive method......isme euclid's algo lga h
    // euclid algo  --->
//        1. gcd(x,y) = gcd(y,x%y)
//        2. gcd(x,0) = x

    public static int hcf(int x,int y){
        if(y==0) return x;
        return hcf(y,x%y);
    }

    // method for LCM --> used formula ( LCM * HCF = x*y )
    static int printLCM(int x, int y){
        int hcf = hcf(x,y); // calling hcf method
        int lcm = (x*y)/hcf;
        return lcm;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x= sc.nextInt();
        int y= sc.nextInt();
//        System.out.println("hcf is "+printhcf(x,y)); // 1st method callng
//        System.out.println("hcf is "+hcf(x,y)); // 2nd method callng (HCF)
        //System.out.println("LCM is "+printLCM(x,y));


    }


}

