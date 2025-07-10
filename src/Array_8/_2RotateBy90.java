package Array_8;

import java.util.Scanner;
// rotate a matrx by 90 degree this is que --> isme hm phle matrix ka transpoze krte hai uske badd matrix ke sabhi row ko reverse kr dete hai.....


public class _2RotateBy90 {
    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // transpoze method -->

    static int[][] transpoze(int[][] arr, int n){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
    //reverse method-->.......

    static int[] reverse(int[] arr){
        int i=0,j= arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }

    static void findRotate(int[][] arr, int r, int c) {
        transpoze(arr, r); //calling method
        for (int i = 0; i < arr.length; i++) {
            reverse(arr[i]); //calling mathod
        }
        System.out.println(" rotate array is :");
        printMatrix(arr);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first matrix size ");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] a = new int[r][c];
        System.out.println("enter " + r * c + " element of array ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix is");
        printMatrix(a);
        findRotate(a,r,c);

    }
}
