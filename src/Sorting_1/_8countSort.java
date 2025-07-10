package Sorting_1;
/*
it is a non comparison based algo
time complexity -->        {ye wala count sort stable nhi hai and non in-place algorithm}
best case --> 0(n)
worst case --> O(n+k) where k is max element present in original array
avg case --> O(n+k)
 */
public class _8countSort {
    static void countSort(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int val : arr){
            if(val>max){
                max = val;
            }
        }

        int freq[] = new int[max+1];
        for(int val : arr){
            freq[val]++;
        }
        int j=0;
        for(int i=0;i< freq.length;i++){
            while(freq[i]>0){
                arr[j] = i;
                freq[i]--;
                j++;

            }
        }



    }
    public static void main(String[] args) {
        int arr[] = {1,4,5,3,2,43,0,8,67,4,57,5};
        countSort(arr);
        for(int val : arr){
            System.out.print(val+" ");
        }


    }
}
