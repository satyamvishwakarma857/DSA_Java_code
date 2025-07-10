package Leetcode;
import java.util.ArrayList;


class Solution {

    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        //int[][] ans = new int[row][2];
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        int m=0;
        for(int i=0;i<row;i++){
            list.add(new ArrayList<Integer>());

            for(int j=0;j<col;j++){
                if(matrix[i][j]==0){
                    //ans[m++]= new int[]{i,j};
                    list.get(i).add(i);
                    list.get(i).add(j);

                }
            }
        }
        for(int i=0;i<list.size();i++){
            int rowIdx = list.get(i).get(0);
            int colIdx = list.get(i).get(1);
            int start =0;
            while(start<col){
                matrix[rowIdx][start]=0;
                start++;
            }
            start=0;
            while(start<row){
                matrix[start][colIdx]=0;
                start++;
            }
        }
        return;

    }
}