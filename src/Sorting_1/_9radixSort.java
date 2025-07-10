package Sorting_1;
/*
it is a non comparison based algo
time complexity -->        {radix sort stable hai and non in-place algorithm}
best case --> 0(dn)
worst case --> O(dn) where d is the no of digit in max no present in array
avg case --> O(dn)

space complexity --> O(n)
 */

public class _9radixSort {
    static int max(int arr[]){
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if(val>max){
                max = val;
            }
        }
        return max;

    }
    static void countSort(int[] arr,int place){

        // make freq array of original array

        int freq[] = new int[10];
        for(int i=0;i<arr.length;i++){
            freq[(arr[i]/place)%10]++;
        }

        //prefix sum of freq array -->
        for(int i=1;i< freq.length;i++){
            freq[i]+=freq[i-1];
        }
        // create a new array of length --> arr.length
        int[] ans = new int[arr.length];


        for(int i=arr.length-1;i>=0;i--){
            int idx = freq[(arr[i]/place)%10]-1;
            ans[idx] = arr[i];
            freq[(arr[i]/place)%10]--;

        }
        //copy all element in original array
        for(int i=0;i<arr.length;i++){
            arr[i] = ans[i];
        }



    }

    static void radixSort(int[] arr){
        int max  = max(arr);
        for(int place=1;max/place>0;place*=10){
            countSort(arr,place);

        }
    }

    public static void main(String[] args) {
        int arr[] = {1,4,5,3,2,43,0,8,5};
        radixSort(arr);
        for(int val : arr){
            System.out.print(val+" ");
        }



    }
}
