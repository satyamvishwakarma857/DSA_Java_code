package recursion;

public class countTheNumber {
    public static int count(int n){
        if(n==0) return 0;
        return count(n/10)+1;
    }

    public static void main(String[] args) {
        System.out.println(count(45364));
    }
}
