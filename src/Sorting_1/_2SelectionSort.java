package Sorting_1;
// min element ko dhudho aur phle position(0 index) pr rkho phir 2nd min -->1 index -->repeat this process until array is sorted
/*
time complexity -->        {selection sort is not stable but in-place algorithm}
best case --> 0(n^2)
worst case --> O(n^2)
avg case --> O(n^2)
 */
public class _2SelectionSort {
    static void selectionSort(int[] arr){
       for(int i=0;i<arr.length-1;i++) {
           int min = Integer.MAX_VALUE;
           int minIndex = 0;
           for (int j = i; j < arr.length; j++) {
               if (arr[j] < min) { // IF condition har baar chalegi kynki hm comapre kr rhe -infinte se aur koi na koi value ise chhoti jarror hogi
                   min = arr[j];
                   minIndex = j;
               }
           }
           int temp = arr[i];
           arr[i] = min;
           arr[minIndex] = temp;
       }
    }

    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1,0,-1};
        selectionSort(arr);
        for(int i: arr){
            System.out.print(i+" ");
        }



    }
}
