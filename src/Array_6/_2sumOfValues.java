package Array_6;
import java.util.*;
//given an array of size n . ans q queries where u need to print the sum of values in a given range of indices l to r

//1st method bruitful approach
// 1 based indexing hai array ka

public class _2sumOfValues {

    static int sum (int[] arr, int l,int r){
        int ans = 0;
        for(int i=l;i<=r;i++){
            ans=ans+arr[i];
        }
        return ans;
    }





// part of second method
    static int[] prefixsum(int[] arr){
        for(int i = 1;i< arr.length;i++){
            arr[i]=arr[i] + arr[i-1];

        }
       return arr;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input arrray
        System.out.println("enter array size");
        int n = sc.nextInt();
        int[] arr = new int[n+1];
        System.out.print("enter array element ");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }


        int [] ans = prefixsum(arr); // calling prefix sum 2nd method

        
        System.out.println("enter no of queries");
        int k = sc.nextInt();
        while(k>0){
            System.out.print("enter range ");
            int l = sc.nextInt();
            int r = sc.nextInt();
            int ans2 = ans[r]-ans[l-1];
            System.out.println(ans2);
            //System.out.println("sum of indice is "+sum(arr,l,r));      //calling 1st method (bruitful wala)
            k--;

        }
    }


}

