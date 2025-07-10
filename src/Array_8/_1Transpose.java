package Array_8;

import java.util.Scanner;

public class _1Transpose {
    // kisi bhi array ko print krne ke liye ......
    static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

// 1 method ........
    static void transpoze(int[][] arr , int r1, int c1){
        int trans[][] = new int[c1][r1];
        for (int i = 0; i < c1; i++) {
            for (int j = 0; j < r1; j++) {
                trans[i][j] = arr[j][i];
            }
        }
        System.out.println("tranpoze matrix is :");
       printMatrix(trans);
    }
    // 2 Method ye wala method bs n*n matrix par lgta hai (swap wala method )

    static void makeTraspoze(int[][] arr, int r1, int c1 ){
        for(int i =0;i<r1;i++){
            for(int j=i;j<c1;j++){
                int temp =arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        System.out.println("transpoze matrix is :");
        printMatrix(arr);
    }
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
        System.out.println("matrix is");
        printMatrix(a);
        //transpoze(a,r1,c1); // 1 method calling
        makeTraspoze(a,r1,c1); // 2 method calling
    }
}
