package CrackingCodingInterview.DynamicProgramming;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 3/13/16.
 */
public class NumberOfPathsFinderTest {

    @Test
    public void testUniquePaths() throws Exception {

        NumberOfPathsFinder n = new NumberOfPathsFinder();
        Assert.assertEquals(1 ,n.uniquePaths(1, 1));
        Assert.assertEquals(2 ,n.uniquePaths(2, 2));
        Assert.assertEquals(6, n.uniquePaths(3, 3));

    }
}