package Recursion_4subSequences;

public class _2subsequencesSecMethod {
    //2nd method inclusion exclusion
    static void subSequence(String str, String currAns ){
        //base case
        // let str = "abc" and currAns = "___"
        if(str.length()==0){
            System.out.print(currAns+" ");
            return;
        }

        char curr = str.charAt(0); //a
        String remString = str.substring(1); //"bc"

        //curr char --> choose to be a part of current ans
        subSequence(remString,currAns+curr); //"a"

        //curr char --> does not choose to be a part of current ans
        subSequence(remString,currAns);  //" "



    }



    public static void main(String[] args) {
        String str = "abc";
        subSequence(str,"");

    }
}
