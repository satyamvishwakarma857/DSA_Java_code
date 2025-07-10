package Sorting_1;
/*
time complexity -->        {quick sort is  not stable and  in-place algorithm}
best case --> 0(nlogn)
avg case --> O(nlogn)
worst case --> O(n^2)
 */

public class _7QuickSort {


     // swap method -->
    static void swap(int[] arr, int left, int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
    }

    static int partition(int[] arr, int left, int right){
        int pivot = arr[left];
        int count = 0;
        for(int i=left+1;i<right+1;i++){
            if(arr[i]<=pivot)
                count++;
        }
        int pivotIdx = left+count;

        swap(arr,left,pivotIdx);

        while(left<pivotIdx && right>pivotIdx) {
            while(arr[left]<=pivot) left++;
            while(arr[right]>pivot) right--;
            if(left<pivotIdx&&right>pivotIdx){
                swap(arr,left,right);

            }
        }
        return pivotIdx;
    }

    static void quickSort(int arr[], int left, int right){
        // base case
        if(left>=right) return;

        // self work
        int pivot= partition(arr,left, right);

        // recursive work
        quickSort(arr, left, pivot-1);
        quickSort(arr, pivot+1,right);
    }


    public static void main(String[] args) {
        int arr[] = {5,7,8,4,0,-4,2,2,1};
        quickSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
