package oops;
class kuchhbhi{
    int x,y;
    kuchhbhi(int a,int b){
        x=a;
        y=b;
    }
    int sum (){
        int sum  = x+y;
        return sum;

    }

}

public class parameterPassThroghConstructor {
    public static void main(String[] args) {
        kuchhbhi obj = new kuchhbhi(5,7);
        System.out.println("the sum of two no is "+obj.sum());

    }
}
