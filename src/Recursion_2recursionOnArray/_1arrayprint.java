package Recursion_2recursionOnArray;

public class _1arrayprint {


    public static void printarr(int arr[],int idx){
        if(idx== arr.length) return;
        System.out.println(arr[idx]);
        printarr(arr,idx+1);

    }


    public static void main(String[] args) {
        int arr[] = {5,6,3,4,5,43,54,34};
        printarr(arr,0);


    }
}




