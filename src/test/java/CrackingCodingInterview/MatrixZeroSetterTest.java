package CrackingCodingInterview;

import CrackingCodingInterview.Strings.MatrixZeroSetter;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by root on 12/16/15.
 */
public class MatrixZeroSetterTest {
    MatrixZeroSetter m = new MatrixZeroSetter();

    @Test
    public void testSetToZero() throws Exception {

        int[][] matrix = {

                {1, 2, 3, 4},
                {2, 4, 0, 8},
                {1, 2, 3, 4},
                {0, 4, 9, 8}
        };




        int[][] ints = m.setToZero(matrix);
        Assert.assertEquals(0, ints[0][0]);
        Assert.assertEquals(0, ints[1][2]);
        Assert.assertEquals(0, ints[1][3]);
        Assert.assertEquals(0, ints[1][1]);
        Assert.assertEquals(0, ints[1][0]);
        Assert.assertEquals(2, ints[0][1]);
        Assert.assertEquals(0, ints[3][1]);
        Assert.assertEquals(4, ints[0][3]);
        Assert.assertEquals(2, ints[2][1]);
        Assert.assertEquals(4, ints[2][3]);

    }
}