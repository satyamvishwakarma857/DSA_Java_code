package Leetcode;

public class slidingWindowMaximum {
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int n = nums.length;
        int k = 3;
        int ans[] = new int[n-k+1];
        int i = 0;
        int j = i+k-1;
        while(j<n){
            int max = Integer.MIN_VALUE;
            for(int m=i;m<=j;m++){
                max = Math.max(max,nums[m]);
            }
            ans[i] = max;
            i++;
            j++;
        }
        for(int a=0;a<ans.length;a++){
            System.out.print(ans[a]+" ");
        }
    }
}
