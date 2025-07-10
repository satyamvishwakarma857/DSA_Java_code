package Array_7;
import java.util.*;

import java.util.*;
public class SumOfMatrices {

    // arrray ko print krne wla method -->

    static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    // sum method to sum of two matrices -->

    static void sum( int a[][],int r1,int c1, int b[][] ,int r2, int c2){
        if(r1!=r2||c1!=c2){
            System.out.println("wrong input - additiom not possible ");
            return;
        }
        int[][] add = new int[r1][c1];
        for(int i=0;i<r1;i++){
            for(int j = 0;j<c1;j++){
                add[i][j] = a[i][j]+b[i][j];

            }
        }
        printMatrix(add); // method calling for print matrix .........


    }

    public static void main(String[] args) {


        // taking matrix input by user -->

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
        System.out.println("enter second matrix size ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        System.out.println("enter "+r2*c2+" element of array");
        int[][] b = new int[r2][c2];
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = sc.nextInt();
            }
        }


        sum(a,r1,c1,b,r2,c2); // calling sum method

    }
}
