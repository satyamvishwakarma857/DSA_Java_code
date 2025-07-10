package Array;

import java.util.Scanner;

public class _3_2uniqueElement {
    static void sum(int[] arr){
        for(int i = 0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]==arr[j]){
                    arr[i]=-1;
                    arr[j]=-1;

                }
            }

        }
        for(int i=0;i< arr.length;i++){
            if(arr[i]>0)
                System.out.println("the unique no is "+ arr[i]);
        }

    }

    public static void main(String[] args) {
        int arr[] = {4,5,6,5,3,2,3,7,2,6};
        sum(arr);

    }
}
