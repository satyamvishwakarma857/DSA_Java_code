package recursion;

public class HCF2 {
    public static int hcf(int x,int y){
        if(y==0) return x;
       return hcf(y,x%y);
    }

    public static void main(String[] args) {
        int x,y;
        System.out.println("hcf is "+hcf(20,15));
    }
}
