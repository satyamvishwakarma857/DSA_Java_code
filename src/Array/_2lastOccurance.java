package Array;
import java.util.*;

public class _2lastOccurance {
    static int last(int[] arr, int x) {
        int i;
        for ( i = arr.length-1; i >= 0; i--) {
            if (arr[i] == x) {
                break;
            }


        }
        return i;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {5,5,3,2,6,7,5,7,8,};
        System.out.println("enter target");
        int target = sc.nextInt();
        System.out.println(" the last occurance of no is at index "+last(arr,target));
    }
}
