package Array_7;

import java.util.Scanner;
// ek 2d array ke sabhii row ko reverse kro

public class reverseRow {

    // 2d array ko print krne ke liye method
    static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    // method 1 hard method
    static void reverse(int[][] arr){
        for (int i = 0; i < arr.length ; i++) {
            for(int j =0;j<arr[i].length-1-j;j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[i][arr[i].length - 1 - j];
                arr[i][arr[i].length - 1 - j] = temp;

            }

        }
        System.out.println("matrix that row is reverse");
        printMatrix(arr);
    }

    // method 2 ...... easy
    static void reverse2(int[] arr){
        int i =0 ,j= arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;

        }
    }

    // main method........
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first matrix size ");
        int r1 = sc.nextInt();
        int c1= sc.nextInt();
        int[][] a = new int[r1][c1];
        System.out.println("enter "+r1*c1+" element of array 1");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println(" real matrix");
        printMatrix(a);
        //reverse(a); // 1 method

        for(int i=0;i< a.length;i++){ // 2 method calling
            reverse2(a[i]);
        }
        System.out.println("reverse matrix");
        printMatrix(a);
    }
}
