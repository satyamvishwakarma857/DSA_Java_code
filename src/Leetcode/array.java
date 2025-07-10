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
