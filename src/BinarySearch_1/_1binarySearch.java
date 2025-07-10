package BinarySearch_1;
// linear search take O(n) but binary search takes O(logn) time complexity
//time complexity of both method recursive and iterartive method is O(logn)
// but space complexity of iterartive method is O(1) and recursive mehod --> O(logn)
public class _1binarySearch {
// que --> tell that target is present in the array or not
    // binary search iterative method -->

    static boolean binarySearch1(int[] arr, int target){

        int start =0, end = arr.length-1, mid;

        while(start<=end) {

            mid = (start+end)/2;

            if (target == arr[mid]) return true;

            else if (target < arr[mid]) {
                end = mid - 1; // reduce search space

            }
            else if(target>arr[mid]){
                start = mid+1; // reduce search space
            }

        }
        return false;
    }


    //recursive method

    static boolean binarySearch2(int[] arr , int st, int end, int target){
        //base case
        if(st>end) return false;

        int mid = st+((end-st)/2);
        //self work

        if(arr[mid]==target) return true;

        else if(arr[mid]>target){
            return binarySearch2(arr, st ,mid-1,target);

        }
        else{
            return binarySearch2(arr,mid+1,end,target);
        }
    }




    public static void main(String args[]){
        int[] arr = {2,4,6,8,23}; // it is a sorted array

        System.out.println(binarySearch1(arr, 4));

        System.out.println(binarySearch2(arr,0,arr.length-1,23));


    }



}
