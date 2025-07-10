package BinarySearch_3;
// que -- > find target is present in 2d matrix or not
// given a matrix  --> element is sorted in the row and ele of first col of next row is greater than last col of last row ..
public class _1targetIn2DArray {
    static boolean search(int[][] arr, int target){
        int row = arr.length, col = arr[0].length;
        int st =0, end = row*col-1;

        while(st<=end){
            int mid = st+(end-st)/2;
            int rowIdx = mid/col;  // formula for calculating row index
            int colIdx = mid%col;  // formula for calculating column index
            int midElt = arr[rowIdx][colIdx];

            if(target == midElt){
                return true;
            }
            else if(target < midElt){
                end = mid-1;
            }
            else{
                st = mid+1;
            }
        }
        return false;

    }



    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7}, {10,11,16,20}, {23,30,34,60}};
        int target = 3;
        System.out.println("Is target is present in 2d array ? : "+search(arr,target));
    }
}
