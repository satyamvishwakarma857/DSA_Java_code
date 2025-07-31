package BackTracking;

public class _1fourDirectionMazeRunner {
    // four movement allowed right , down , left and up -->>
    static int printWays(int sr, int sc, int er, int ec,String s,boolean isVisited[][]){
        if(sr>er || sc>ec|| sr<0 || sc<0) return 0;
        if(isVisited[sr][sc]==true) return 0;
        if(sr==er && sc == ec){
            System.out.println(s);
            return 1;
        }


        isVisited[sr][sc] = true;// checkMark
        int rightWays = printWays(sr,sc+1,er,ec, s+'R',isVisited);
        int downWays = printWays(sr+1,sc,er,ec, s+'D',isVisited);
        int leftWays = printWays(sr,sc-1,er,ec, s+'L',isVisited);
        int upWays = printWays(sr-1,sc,er,ec, s+'U',isVisited);
        int totalWays = rightWays+downWays+leftWays+upWays;

        // BackTracking -->>
        isVisited[sr][sc] = false;
        return totalWays;


    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        boolean isVisited[][] = new boolean[row][col]; // false
        int ans = printWays(0,0,row-1,col-1,"",isVisited);
        System.out.println(ans);
    }
}
