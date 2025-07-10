package Sorting_1;
/*
it is a non comparison based algo
time complexity -->        {ye wala count sort stable hai and non in-place algorithm}
best case --> 0(n)
worst case --> O(n+k) where k is max element present in original array
avg case --> O(n+k)

space complexity --> O(n+k)
 */


public class _8countSort2 {
    static void countSort(int[] arr){
        //to find max value in original array
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if(val>max){
                max = val;
            }
        }
        // make freq array of original array

        int freq[] = new int[max+1];
        for(int val : arr){
            freq[val]++;
        }

        //prefix sum of freq array -->
        for(int i=1;i< freq.length;i++){
            freq[i]+=freq[i-1];
        }
        // create a new array of length --> arr.length
        int[] ans = new int[arr.length];


        for(int i=arr.length-1;i>=0;i--){
            ans[freq[arr[i]]-1] = arr[i]; // example likh ke dekho to smjh aayega
            freq[arr[i]]--;

        }
        for(int val : ans){
            System.out.print(val+" ");
        }



    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,3,2,43,0,8,5};
        countSort(arr);



    }
}
