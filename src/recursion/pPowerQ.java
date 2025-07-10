//package recursion;
//
//public class pPowerQ {
//    public static int printno(int p,int q){
//        if(q==0) return 1;
//        return printno(p,q-1)*p;
//    }
//
//    public static void main(String[] args) {
//        System.out.println(printno(2,5));
//    }
//}

//2nd method
// best way to minimize time and space complexity ....
package recursion;

public class pPowerQ {
    public static int printno(int p,int q){
        if(q==0) return 1;
       int m = printno(p,q/2);
        if(q%2==0){
            return m*m;
        }else{
            return p*m*m;
        }
    }

    public static void main(String[] args) {
        System.out.println(printno(2,4));
    }
}
