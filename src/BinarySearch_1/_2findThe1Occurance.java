package BinarySearch_1;
// find the 1st occurance of the given target -->
public class _2findThe1Occurance {
    static int getIndex(int[] arr, int target){

        int start =0, end = arr.length-1, mid;
        int idx = -1;
        while(start<=end) {
            mid = (start+end)/2;
            if (target == arr[mid]) {
                idx = mid;
                end = mid-1; // it is for 1st occurance

                //start = mid+1; // for last occurance

            }
            else if (target < arr[mid]) {
                end = mid - 1;

            }
            else if(target>arr[mid]){
                start = mid+1;
            }

        }
        return idx;
    }



    public static void main(String[] args) {
        int[] arr = {3,3,5,5,5,5,5,9,9}; // sorted array with repeating elements
        int target = 5;
        System.out.println("1st occurance at index : "+getIndex(arr,target));

    }
}
