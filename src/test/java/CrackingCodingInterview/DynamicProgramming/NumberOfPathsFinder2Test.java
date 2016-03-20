package CrackingCodingInterview.DynamicProgramming;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 3/13/16.
 */
public class NumberOfPathsFinder2Test {

    @Test
    public void testUniquePaths() throws Exception {

    NumberOfPathsFinder2 n = new NumberOfPathsFinder2();
        int[][] grid = new int[3][3];
        grid[1][1] =1;
        Assert.assertEquals(2 , n.uniquePathsWithObstacles(grid));
        int[][] grid1 = new int[5][4];
        grid1[1][1] = 1;
        grid1[3][2] = 1;
        Assert.assertEquals(7 , n.uniquePathsWithObstacles(grid1));
        Assert.assertEquals(0 , n.uniquePathsWithObstacles(new int[][]{{1}}));





    }
}