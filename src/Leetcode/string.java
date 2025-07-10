package Leetcode;

public class string {
    static int finalValueAfterOperations(String[] operations) {
        int n = operations.length;
        int positive = 0;
        for(int i=0;i<n;i++){
            if(operations[i]=="++X" || operations[i]=="X++"){
                positive++;

            }
        }
        return positive-(n-positive);

    }


    public static void main(String[] args) {
        String s = "dhhkfd";
        String v = "bdjhjsdhs";
        String x = v+s;
        System.out.println(x);
//        String[] arr = {"X++","++X","--X","X--"};
//        int ans = finalValueAfterOperations(arr);
//        System.out.println(ans);


    }
}
/*
class Solution {
    public String makeSmallestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        int left =0, right = s.length()-1;
        while(left<right){
            if((int)sb.charAt(left)<(int)sb.charAt(right)){
                //sb=sb.replace(sb.charAt(right),sb.charAt(left));
                sb.setCharAt(right, sb.charAt(left));

            }
            else if((int)sb.charAt(left)>(int)sb.charAt(right)){
               // sb=sb.replace(sb.charAt(left),sb.charAt(right));
                sb.setCharAt(left, sb.charAt(right));


            }
            left++;
            right--;
        }
        return sb.toString();

    }
}
*/
