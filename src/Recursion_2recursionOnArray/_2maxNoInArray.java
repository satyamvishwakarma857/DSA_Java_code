package Recursion_2recursionOnArray;

public class _2maxNoInArray {

    public static int printmax(int arr[],int idx){
        // base case --->
        if(idx==arr.length-1) return arr[idx];

        // smallans --> idx+1, end of the array --> max
        int smallans = printmax(arr,idx+1);

        //self work and final ans
        return Math.max(arr[idx], smallans);

    }
    public static void main(String[] args) {
        int arr[] = {3,23,6,54,43};
        System.out.println("max no in array is "+printmax(arr, 0));

    }
}
