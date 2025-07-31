package Recursion_4subSequences;

import java.util.ArrayList;

public class _4permutation {
    static void permutation(String str, String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<str.length();i++){
            char curr = str.charAt(i); // a
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left+right; // bc
            permutation(rem,ans+curr);
        }


    }

    public static void main(String[] args) {
        String str = "abc";
        permutation(str,"");
        //print arraylist



    }

}
