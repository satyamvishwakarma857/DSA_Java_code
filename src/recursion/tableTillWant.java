package recursion;

public class tableTillWant {
    public static void printTable(int p, int q) {
        if (q == 0) return ;
        printTable(p, q - 1);
        System.out.println(p*q);



    }
    public static void main(String[] args) {
        int p,q;
       printTable(5,3
       );
    }
}
