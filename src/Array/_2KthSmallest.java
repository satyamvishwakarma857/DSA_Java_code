package Array;

import java.util.*;

public class _2KthSmallest {
    static void KthSmallest(int[] array ,int x){
        Arrays.sort(array);
        System.out.println("Kth smallest element is "+array[x-1]);
        System.out.println("Kth largest element is "+array[array.length-x]);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {49,5,2,43,56,87,2};
        System.out.println("enter kth smallest and kth largest element");
        int x = sc.nextInt();
        KthSmallest(arr,x);
    }
}
