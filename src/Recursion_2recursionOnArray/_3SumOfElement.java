package Recursion_2recursionOnArray;

public class _3SumOfElement {
    public static int printsum(int arr[],int idx){
        if(idx== arr.length-1) return arr[idx];
        return arr[idx]+printsum(arr,idx+1);
    }

    public static void main(String[] args) {
        int arr[] = {5,6,3,6,8};
        System.out.println("the sum of element is "+printsum(arr,0));
    }
}
