package Leetcode;



public class pivot {
    static int[] makePivot(int[] arr, int pivot) {
        int n = arr.length;
        int ans[] = new int[n];
        int small = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < pivot){
                ans[small++] = arr[i];
            }

        }
        for (int i = 0; i < n; i++) {
            if (arr[i] == pivot){
                ans[small++]=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]>pivot){
                ans[small++]=arr[i];
            }
        }
        return ans;

    }


    public static void main(String[] args) {
        int[] arr = {-3,4,3,2};
        int[] ans =makePivot(arr,2);
        for(int i=0;i< arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

