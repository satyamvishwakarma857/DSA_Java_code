package Recursion_3recursionOnString;

public class _2reverseString {
    // write by me-->
    static void makeReverse(String s,int idx){
        //base case
        if(idx==-1)
            return;

        //self work
        System.out.print(s.charAt(idx)+"");

        //recursive work
        makeReverse(s,idx-1);
    }


    //mam wala method
    static String reverse(String str,int idx){
         // base case
        if(idx==str.length())
            return "";

        // recursive work
        String smallAns = reverse(str,idx+1);

        //self work
        return smallAns+=str.charAt(idx);
    }


    public static void main(String[] args) {
        String str ="india is my country";
        //makeReverse(str,str.length()-1); // 1st method .....is method me idx length-1 pass h
        System.out.println();
        System.out.println(reverse(str,0)); //2nd method ....isme idx=0 pass hai

    }
}

