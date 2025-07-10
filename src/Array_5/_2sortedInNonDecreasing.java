package Array_5;

public class _2sortedInNonDecreasing {
    static int[] sorted(int[] arr){
        int n = arr.length;
        int left =0, right = n-1;
        int ans[] = new int[n];
        int j=0;
        while(left<=right){
            if(Math.abs(arr[left])>Math.abs(arr[right])){
                ans[j++]=arr[left]*arr[left];
                left++;

            }
            else{
                ans[j++]=arr[right]*arr[right];
                right--;

            }
        }

        return ans;
    }
    static void revers(int arr[]) {
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length - 1 - i; i++) {
            temp[0] = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp[0];

        }
    }

    public static void main(String[] args) {
        int arr[] = {-10,-6,-5,6,7,8};
        int ans[] = sorted(arr);
        revers(ans);
        for(int i=0;i<arr.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
