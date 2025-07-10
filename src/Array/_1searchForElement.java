package Array;
import java.util.Scanner;
public class _1searchForElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter row no : ");
        int row = sc.nextInt();
        System.out.print("enter column no : ");
        int column = sc.nextInt();
        int[][] matrix = new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j] = sc.nextInt();

            }

        }
        System.out.print("enter the no which want u search : ");
        int x= 0;
        int no = sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                if(matrix[i][j]==no){
                    System.out.println("row no is "+i+ " and column no is "+j);
                    x=1;

                }

            }



        }
        if (x==0) System.out.println("-1");
    }
}
