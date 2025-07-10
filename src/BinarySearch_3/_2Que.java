package BinarySearch_3;

public class _2Que {
    static boolean search(int[][] arr, int target){
        int row = arr.length, colm= arr[0].length;
        int i = 0, j = colm-1;

        while (i<row && j >= 0){
            int searchIdx = arr[i][j];

            if( searchIdx == target){
                return true;
            }
            else if(target < searchIdx){
                j--; // move left

            }
            else{
                i++; // move bottom
            }
        }
        return false;

    }


    public static void main(String[] args) {
        int[][] arr = {{2,4,6,8}, {5,6,7,20}, {7,11,13,25}, {12,14,17,30}}; //this 2d array is sorted from left to right and top to bottom also....
        int target = 0;
        System.out.println(search(arr,target));
    }
}
