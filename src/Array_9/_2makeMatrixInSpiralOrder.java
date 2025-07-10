package Array_9;

import java.util.Scanner;

public class _2makeMatrixInSpiralOrder {
    //method to print matrix -->
    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    
    
    static int[][] spiral(int n){
        int topRow = 0, bottomRow = n - 1, leftCol = 0, rightCol = n - 1;
        int[][] arr = new int[n][n];
        int totalElement = 0;
        int sum = 1;
        while(totalElement<n*n){
            //print top row --> leftcol to rightCol
            for (int j = leftCol; j <= rightCol && totalElement < n*n ; j++) {
                arr[topRow][j] = sum++;
                totalElement++;
            }
            topRow++;
            //print right colm --> toprow to bootomRow
            for (int i = topRow; i <= bottomRow && totalElement < n*n; i++) {
                arr[i][rightCol] = sum++;
                totalElement++;

            }
            rightCol--;
            //print bottom row --> rightColm to leftColm
            for (int j = rightCol; j >= leftCol && totalElement < n*n; j--) {
               arr[bottomRow][j] = sum++;
                totalElement++;

            }
            bottomRow--;
            //print left colm
            for (int i = bottomRow; i >= topRow && totalElement < n*n; i--) {
                arr[i][leftCol] = sum++;
                totalElement++;
            }
            leftCol++;
        }
        return arr;
        }
        
        
        


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array ");
        int n = sc.nextInt();
        int[][] ans =  spiral(n);
        printMatrix(ans);
        
    }
    
}
