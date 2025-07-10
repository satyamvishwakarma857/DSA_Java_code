package Array;
import java.util.*;
//second largest no in array // ans will always exist// array ko modify krna pda h is approach me
public class _3_3secondLargestNo {
    static int max(int [] arr){
        int x= Integer.MIN_VALUE;
        for (int i= 0;i<arr.length;i++){
            if(arr[i]>x){
                x=arr[i];
            }

        }

      return x;


    }
    static int secondMax(int arr[]){
        int mx = max(arr);
        for(int i = 0;i< arr.length;i++){
            if(arr[i]==mx){
                arr[i]=Integer.MIN_VALUE;
            }
        }
        int secondmx = max(arr);
        return secondmx;
    }

    public static void main(String[] args) {
        int[] arr = {9,8,6,67,87,87,90,90,9,9,3};
        System.out.println(" second max is "+secondMax(arr));
    }
}
