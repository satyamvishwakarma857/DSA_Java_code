package Array_8;

import java.util.Scanner;

public class _4PascalTriangle {


    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row of matrix ");
        int r = sc.nextInt();
        int[][] pascle = new int[r][];
        for(int i=0;i<r;i++){
            pascle[i] = new int[i+1];//ith row me i+1 col dene ke liye
            for(int j=0;j<=i;j++){
                if(j==0||j==i){
                    pascle[i][j] = 1;
                }
                else {
                    pascle[i][j] = pascle[i - 1][j] + pascle[i - 1][j - 1];
                }
            }
        }
        printMatrix(pascle);
    }
}
