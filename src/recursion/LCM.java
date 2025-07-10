package recursion;

public class LCM {
    public static int hcf(int x,int y){
        if(y==0) return x;
        return hcf(y,x%y);
    }

    public static void main(String[] args) {
        int x,y;
        x=20;
        y=8;
        int m =hcf(x,y);
        int lcm = (x*y)/m;
        System.out.println("LCM is "+lcm);

    }
}


