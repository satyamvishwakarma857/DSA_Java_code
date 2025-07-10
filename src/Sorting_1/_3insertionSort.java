package Sorting_1;
/*
time complexity -->        {insertion sort is  stable and in-place algorithm}
best case --> 0(n)
worst case --> O(n^2)
avg case --> O(n^2)
 */


public class _3insertionSort {
     static void insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0&&arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }


    }





    public static void main(String[] args) {
        int arr[] = {8,5,3,4,5,2,9,7,5,0,0,0,-2,-6,-65};
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

    }


}
