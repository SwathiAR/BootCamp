package CrackingCodingInterview.DynamicProgramming;

/**
 * Created by root on 3/13/16.
 */
public class Fibonacci {

public int getFibonacci(int num){

    int[] dp = new int[num+1];
    dp[0] = 1;
    dp[1] = 1;
     return fibonacciHelper(num , dp);



}

    private int fibonacciHelper(int num, int[] dp) {
        if (dp[num] != 0) {
            return dp[num];
        } else {
            dp[num] = fibonacciHelper(num - 1 , dp) + fibonacciHelper(num - 2 , dp);
            return dp[num];
        }
    }


}
