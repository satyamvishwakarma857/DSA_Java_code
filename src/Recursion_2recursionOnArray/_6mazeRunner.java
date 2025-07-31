package Recursion_2recursionOnArray;

public class _6mazeRunner {
    // only right and down movement allowed at a time-->
    static int printWays(int sr, int sc, int er, int ec,String s){
        if(sr>er || sc>ec) return 0;
        if(sr==er && sc == ec){
            System.out.println(s);
            return 1;
        }

        int rightWays = printWays(sr,sc+1,er,ec, s+'R');
        int downWays = printWays(sr+1,sc,er,ec, s+'D');
        int totalWays = rightWays+downWays;
        return totalWays;


    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int ans = printWays(0,0,row-1,col-1,"");
        System.out.println(ans);
    }
}
