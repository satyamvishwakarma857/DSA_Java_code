package Array_10;
// prefix sum type ka que h jo 1d array me ek baar kr chuka hu ---->

import java.util.Scanner;

public class _1sumOfReactangle {
    // 2d array ko print krne ke liye method
    static void printMatrix(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }

// 1 method brutful approach .....agr q query puchh le to isme hme array ko baar-2 traverse krna padta hai
    static void makeSum(int[][]arr, int l1,int r1,int l2,int r2){
        int count = 0;
        for(int i=l1;i<=l2;i++){
            for(int j=r1;j<=r2;j++){
                count= count+arr[i][j];
            }
        }
        System.out.println("total sum is "+count);
    }

// part of 2nd method
    static void prefixsum(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i] + arr[i - 1];

        }
    }


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
       // makeSum(a,l1,r1,l2,r2);       // 1st method calling

// 2nd method isme hm hr row ka prefix sum bna dete h uske baad row pr trverse krke sum calculate krte hai
        for(int i=0;i< a.length;i++){
            prefixsum(a[i]); // calling prefix sum
        }
        int sum = 0;
        for(int i=l1;i<=l2;i++){
            if(r1>0)
            sum+= a[i][r2]-a[i][r1-1];
            else
                sum+= a[i][r2];
        }
        System.out.println("total sum is "+sum);

    }

}
