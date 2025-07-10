package recursion2;

public class _7table {
    public static void table(int n,int k){
        if(k==1){
            System.out.print(n+" ");
            return ;}
         table(n,k-1);
        System.out.print(n*k+" ");
    }

    public static void main(String[] args) {
        int n,k;
        table(13,5);
    }
}
