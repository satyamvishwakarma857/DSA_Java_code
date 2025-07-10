package Recursion_4subSequences;
// sequences of {abc} --> {"a","b","c","ab","ac","bc","abc","",}
//if n char in a string --> them 2^n subsequences exist ....

import java.util.ArrayList;

public class _1subSequence {
    // let str == "abc"
    static ArrayList<String> subsequence(String str){ ///isme hme subset ko ek arraylist me return krna hai ....
        ArrayList<String> ans = new ArrayList<String>();

        // base case
        if(str.length()==0){
            ans.add(""); // arraylist me empty string add hoga jb str ki length 0 hogi
            return ans;

        }


       // recursive work
        ArrayList<String> smallAns = subsequence(str.substring(1)); //{"b" ,"c" ,"bc" , ""}

        char curr = str.charAt(0); // a
        //self work
        for(int i=0;i<smallAns.size();i++){
            ans.add(smallAns.get(i));         //add in ans arraylist-->{"b" ,"c" ,"bc" , ""}
            ans.add(curr+smallAns.get(i));    //add in ans arraylist-->{"ab" ,"ac" ,"abc" , "a"}
        }
        return ans;

    }



    public static void main(String[] args) {
        String str = "abcd";
        ArrayList<String> ans = subsequence(str);
        //print arraylist
        for(String ss : ans){
            System.out.print(ss+" ");
        }


    }

}

// space complexity ==> O(2^n) ----> to much space used by this method
