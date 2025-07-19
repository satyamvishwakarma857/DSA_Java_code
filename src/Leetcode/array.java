package Leetcode;

public class array {
    static int[] shuffle(int[] nums, int n) {
        int ans[] = new int[nums.length];

        int even = 0;
        for(int i=0;i<nums.length;i++){
            if(i%2==0){
                ans[i]=nums[even++];
            }
            else{
                ans[i]=nums[n++];
            }
        }

        return ans;


    }
    public static void main(String[] args) {
        int[] arr = {1,1,2,2};

        int ans[] = (shuffle(arr,2));
        for(int i=0;i<(2*2);i++){
            System.out.print(ans[i]+" ");
            }


    }
}
/*
class Solution {
    public int[] asteroidCollision(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0) st.push(arr[i]);
            else if(arr[i]<0 && st.peek()>0){
                while(st.size()>0 && Math.abs(arr[i])>=st.peek() && st.peek()>0){
                int x = st.pop();
                if(st.size()>0 && st.peek()<0 && Math.abs(arr[i])!=x) st.push(arr[i]);




            }
            }
            else{
                st.push(arr[i]);
            }



        }
        int size = st.size();
        int ans[] = new int[size];
        for(int i=ans.length-1;i>=0;i--){
            ans[i] = st.pop();
        }
        return ans;




    }
}
 */