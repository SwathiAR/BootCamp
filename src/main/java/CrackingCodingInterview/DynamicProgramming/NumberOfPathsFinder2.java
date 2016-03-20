package CrackingCodingInterview.DynamicProgramming;

/**
 * Created by root on 3/13/16.
 */
public class NumberOfPathsFinder2 {

    public int uniquePathsWithObstacles(int[][] grid){

        int x = grid.length;

        int y = grid[0].length;
        int[][] dp = new int[x][y];


        return helper(x-1, y-1 , grid , dp);


    }

    private int helper(int x, int y , int[][] grid , int[][] dp) {
        if(x <0 || y<0 ){
            return 0;
        }
        if(x==0 && y==0){
            if(grid[x][y] == 0) {
                return 1;
            }
            else{
                return 0;
            }
            
        }
        if(grid[x][y] == 1){
            return 0;
        }

        if (dp[x][y] != 0){
            return dp[x][y];
        }

       else {
            dp[x][y] = helper(x - 1, y, grid , dp) + helper(x, y - 1, grid , dp);
            return dp[x][y];
        }
    }



}
