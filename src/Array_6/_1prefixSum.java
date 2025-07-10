package Array_6;

import java.util.Arrays;

public class _1prefixSum {
    static int[] prefixsum(int[] arr) {
        int n = arr.length;

        //arr[0] = arr[0];
        for (int i = 1; i < n; i++) {
            arr[i] = arr[i] + arr[i - 1];

        }

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4,8,3};
        prefixsum(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

