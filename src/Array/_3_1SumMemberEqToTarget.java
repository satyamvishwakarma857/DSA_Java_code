package Array;
import java.util.*;

public class _3_1SumMemberEqToTarget {
    static void sum(int[] arr,int x){
        int sum = 0;
        for(int i = 0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==x){
                    sum+=1;
                    System.out.println(arr[i] +","+arr[j]);

                }
            }

        }
        System.out.println("total no of pair is "+sum);
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter targer");
        int x= sc.nextInt();
        int arr[] = {4,6,3,3,8,2};
        sum(arr,x);

    }
}
