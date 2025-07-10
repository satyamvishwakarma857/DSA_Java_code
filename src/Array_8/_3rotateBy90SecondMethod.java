package Array_8;

import java.util.Scanner;

public class _3rotateBy90SecondMethod {
    // kisi bhi array ko print krne ke liye ......
    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // array ko 90 degree rotate krne ke liye second method
    static void rotate(int[][] arr,int r, int c) {
        int[][] makeRotate = new int[r][c];
        int k = arr.length - 1;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                makeRotate[i][j] = arr[k][i]; // main logic yahi hai maine apne aap se likha h dry run krke smjh skte ho
                k--;
            }
            k= arr.length-1;
        }
        System.out.println("rotate matrix is");
        printMatrix(makeRotate);
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
        rotate(a,r,c);
    }

}
