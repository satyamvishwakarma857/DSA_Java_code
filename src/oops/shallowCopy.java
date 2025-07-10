package oops;


public class shallowCopy {
    static void sum(int a){
        a+=100;

    }
    public static void main(String[] args) {

        int a =10;
        sum(a);
        System.out.println(a);

    }
}

