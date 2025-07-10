package BinarySearch_3;
 // que --> return the peak index i such that arr[i-1]<arr[i]>arr[i+1]
public class _3peakIndex {
    static int getPeakIdx(int[] arr){
        int st = 0, end = arr.length-1;
        int ans = -1;
        while(st <= end){
            int mid = st + (end - st)/2;

            if(arr[mid] < arr[mid+1]){
                ans = mid+1;
                st = mid+1;

            }
            else{
                end = mid-1;
            }
        }
        return ans;
    }






    public static void main(String[] args) {
        int arr[] = {2,3,45,67,80,8,4,3,2,1,0};
        System.out.println("peak idx is : "+getPeakIdx(arr));


    }
}
