package Array_9;

import java.util.Scanner;

public class _1spiralMatrix {

    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

    static void spiral(int[][] arr, int r ,int c) {
        int topRow = 0, bottomRow = r - 1, leftCol = 0, rightCol = c - 1;
        int totalElement = 0;
        while(totalElement < r * c) {
            //print top row --> leftcol to rightCol
            for (int j = leftCol; j <= rightCol && totalElement < r * c ; j++) {
                System.out.print(arr[topRow][j] + " ");
                totalElement++;
            }
            topRow++;
            //print right colm --> toprow to bootomRow
            for (int i = topRow; i <= bottomRow && totalElement < r * c; i++) {
                System.out.print(arr[i][rightCol] + " ");
                totalElement++;

            }
            rightCol--;
            //print bottom row --> rightColm to leftColm
            for (int j = rightCol; j >= leftCol && totalElement < r * c; j--) {
                System.out.print(arr[bottomRow][j] + " ");
                totalElement++;

            }
            bottomRow--;
            //print left colm
            for (int i = bottomRow; i >= topRow && totalElement < r * c; i--) {
                System.out.print(arr[i][leftCol] + " ");
                totalElement++;
            }
            leftCol++;
        }
    }

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("enter first matrix size ");
            int r = sc.nextInt();
            int c = sc.nextInt();
            int[][] a = new int[r][c];
            System.out.println("enter " + r * c + " element of array 1");
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            System.out.println("matrix is");
            printMatrix(a);
            System.out.println("spiral order is :");
            spiral(a, r, c);
        }

}
