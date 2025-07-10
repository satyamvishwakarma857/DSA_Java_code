package Recursion_5FrogPblm;

public class _2keyPad {
    //let String is "23"
    static void keypad(String s, String[] arr, String result ){
        if(s.length()==0){
            System.out.print(result+" ");
            return;

        }


        int currNum = s.charAt(0)-'0';// int 2 not char 2
        String currChoice = arr[currNum];

        for(int i=0;i<currChoice.length();i++){
            keypad(s.substring(1), arr, result+currChoice.charAt(i));
        }
    }





    public static void main(String[] args) {
        String s ="2";
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        keypad(s,kp,"");
    }


}


