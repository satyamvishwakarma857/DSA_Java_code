package Array_7;

import java.util.Scanner;
// ye thoda badhiya que h dimag lagane wala isme ek matrix ko manually multiply krke phir logic bnao tabhi smjh aayega

public class multiplyOfMatrix {

    static void printMatrix(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    static void mul( int a[][],int r1,int c1, int b[][] ,int r2, int c2) {
        if (c1!=r2) {
            System.out.println("wrong input - multiplication not possible ");
            return;
        }
        int[][] mul = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for(int k=0;k<c1;k++){
                     mul[i][j] +=a[i][k]*b[k][j]; //main logic yahi h bas
                }


            }
        }
        System.out.println("matrix after multiplication :");
        printMatrix(mul); // method calling for print matrix .........
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
        System.out.println("matrix 1 ");
        printMatrix(a);
        System.out.println("matrix 2");
        printMatrix(b);
        mul(a,r1,c1,b,r2,c2);

    }
}
