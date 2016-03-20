package CrackingCodingInterview.DynamicProgramming;

/**
 * Created by root on 3/13/16.
 */
public class NumberOfPathsFinder {

    public int uniquePaths(int x , int y){
        int[][] dp = new int[x][y];
        dp[0][0] = 1;

        return helper(x-1, y-1 , dp);


    }

    private int helper(int x, int y , int[][] dp) {
        if(x <0 || y<0){
            return 0;
        }
//        else if(x==0 && y==0){
//            return 1;
//        }

        if (dp[x][y] != 0){
            return dp[x][y];
        }

        dp[x][y] = helper(x-1 , y , dp) + helper(x , y-1 , dp);
        return dp[x][y];
    }
}
