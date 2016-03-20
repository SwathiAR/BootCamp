package CrackingCodingInterview.DynamicProgramming;

import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 3/19/16.
 */
public class MaxPathInPiramidTest {
    MaxPathInPiramid m = new MaxPathInPiramid();




    @Test
    public void testFindMaxPath() throws Exception {
        int[][] piramid = new int[][]{
                {8},
                {0, 4},
                {5, 5, 5},
                {8, 8, 3, 4},
                {1, 5, 6, 7, 8},
        };

        Assert.assertEquals(31 , m.findMaxPath(piramid));

        int[][] piramid2 = new int[][]{
                {55},
                {94, 48},
                {95, 30, 96},
                {77, 71, 26, 67},
        };

        Assert.assertEquals(321 , m.findMaxPath(piramid2));



    }
}