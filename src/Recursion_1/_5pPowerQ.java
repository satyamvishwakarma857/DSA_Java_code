package Recursion_1;

public class _5pPowerQ {
    public static int printno(int p,int q){
        if(q==0) return 1;
        return printno(p,q-1)*p;
    }

    public static void main(String[] args) {
        int p,q;
        System.out.println(printno(2,4));
    }
}
