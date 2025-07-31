package BackTracking;

public class _2RatInDeadMazeRunner {
    // 4 direction movement allowed -->>
    static int printWays(int sr, int sc, int er, int ec,String s,int[][] maze){
        if(sr>er || sc>ec || sr<0 || sc<0) return 0;
        if(sr==er && sc == ec){
            System.out.println(s);
            return 1;
        }
        if(maze[sr][sc]==0 || maze[sr][sc]==-1) return 0;

        // check
        maze[sr][sc] = -1;

        int rightWays = printWays(sr,sc+1,er,ec, s+'R',maze);
        int downWays = printWays(sr+1,sc,er,ec, s+'D',maze);
        int leftWays = printWays(sr,sc-1,er,ec, s+'L',maze);
        int upWays = printWays(sr-1,sc,er,ec, s+'U',maze);
        int totalWays = rightWays+downWays+leftWays+upWays;

        //backtracking -->>
        maze[sr][sc] = 1;

        return totalWays;


    }
    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        // given maze path -->> 0 pe jana allowed nahi hai
        int[][] maze = {{1,1,1},
                {1,1,1},
                {1,0,1}};
        int ans = printWays(0,0,row-1,col-1,"",maze);
        System.out.println(ans);
    }
}
