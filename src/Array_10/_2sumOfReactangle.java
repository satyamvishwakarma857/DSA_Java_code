package Array_10;

import java.util.Scanner;

public class _2sumOfReactangle {

    // 2d array ko print krne ke liye method
    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }




    // prefix sum row wise and col wise -->

    static int[][] makePrefixSum(int[][] arr ){
        int r = arr.length;
        int c = arr[0].length; //

        // row wise prefix sum -->
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        // calculate col wise prefix sum
        for(int j=0;j<c;j++) { // fixing col
            for(int i=1;i<r;i++){
                arr[i][j]+=arr[i-1][j];
            }


        }
        return(arr);

    }


    static int findSum(int[][] arr,int l1, int r1, int l2, int r2){
        int ans =0, sum=0, up=0, left=0, leftup=0;
        makePrefixSum(arr);
        System.out.println("prefix ");
        printMatrix(arr);
        sum = arr[l2][r2];
        if(r1>=1)
            left = arr[l2][r1-1];
        if(l1>=1)
            up = arr[l1-1][r2];
        if(l1>=1 && r1>=1) {
            leftup = arr[l1 - 1][r1 - 1];
        }
        ans = sum - up - left + leftup;
        return ans;
    }

    // main method -->

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter matrix size ");
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
        System.out.println("enter l1 and r1 :");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        System.out.println("enter l2 and r2 :");
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("sum is "+findSum(a,l1,r1,l2,r2)); //calling findSum method


    }
}
