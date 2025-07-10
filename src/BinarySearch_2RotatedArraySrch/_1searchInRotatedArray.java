package BinarySearch_2RotatedArraySrch;
// given a rotated sorted array --> find the index of minimum elemenet in the array

import java.lang.reflect.Array;
import java.util.Arrays;

// is que me ek property use kiya gya h
public class _1searchInRotatedArray {
    static int searchMin(int arr[]){


        int st =0, end = arr.length-1;
        int ans =0;
        while(st<=end){

            int mid = st+((end-st)/2);
            // aise bhi kiya ja skta hai isme ans variable ki jarrot nhi pdegi
            if(mid==0 || mid == arr.length-1) return mid;
            if(arr[mid] < arr[mid-1] && arr[mid] < arr[mid+1]) return mid;


            if(arr[mid]>arr[end]){ // you are 1st half of the rotated array
                st = mid+1;

            }
            else{
                //ans = mid;
                end = mid-1;
            }

        }
        return ans;

    }


    public static void main(String[] args) {
        int[] arr = {3,4,6,7,8,2}; //rotated sorted array
        System.out.println("index of min element is : "+searchMin(arr));
    }
}
