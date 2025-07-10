package Sorting_1;
// its work on divide and conquare approach ........
//concept--> isme hm recursion se kahte h ki arr ke 1st half part and 2nd half part ko sort kr do bs
// phir hm un dono adhe adhe part ko mrege krke ek single sorted array bna denge

/*
time complexity -->        {merge sort is  stable and no in-place algorithm}
best case --> 0(nlogn)
worst case --> O(nlogn)
avg case --> O(nlogn)
 */

public class _6MergeSort {
    // merge method jo ki self work hai ....
    static void merge(int arr[] , int left, int mid, int right){
        int n1= mid-left+1;
        int n2 = right-mid;
        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];
        for(int i=0;i<n1;i++){
            leftArr[i] = arr[left+i];
        }
        for(int i=0;i<n2;i++){
            rightArr[i] = arr[mid+1+i];
        }

        int i=0,j=0,k=left;
        while(i<n1&&j<n2){
            if(leftArr[i]<=rightArr[j]){
                arr[k] = leftArr[i];
                k++;
                i++;
            }
            else{
                arr[k++]=rightArr[j++];
            }

        }
        while(i<n1){
            arr[k++]=leftArr[i++];
        }
        while(j<n2){
            arr[k++]=rightArr[j++];
        }
    }



    static void mergesort(int[] arr, int left, int right){
        // base case
        if(left>=right) return;

        int mid = (left+right)/2;


        // recursive work
        mergesort(arr,left,mid); //recursion will sort 1st half part of array
        mergesort(arr,mid+1, right); //recursion will sort 2nd half part of array

        //self work
        merge(arr,left,mid,right); //calling merge method (dono sort part ko merge krke ek single sorted array bna dega

    }

    public static void main(String[] args) {
        int arr[] = {6,8,0,3,4,76,2,1,-8};
        mergesort(arr,0,arr.length-1);
        System.out.println("sorted array is:");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


    }
}
