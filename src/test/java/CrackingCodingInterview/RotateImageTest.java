package CrackingCodingInterview;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/15/15.
 */
public class RotateImageTest {

    RotateImage r = new RotateImage();



    @Test
    public void testRotate() throws Exception {

        int[][] array = new int[][]{

                {11 , 21 , 31, 41},
                {22,32,42,52},
                {33,43,53,63},
                {44,54,64,74}


        };

        int[][] array1 = new int[][]{

                {11 , 22 , 33, 44},
                {21,32,43,54},
                {31,42,53,64},
                {41,52,63,74}


        };
        int[][] rotate = r.rotate(array);
        Assert.assertEquals(rotate[0][0], array1[0][0]);
        Assert.assertEquals(rotate[0][2] , array1[0][2]);
        Assert.assertEquals(rotate[0][3] , array1[0][3]);
        Assert.assertEquals(rotate[0][1] , array1[0][1]);
    }

    @Test
    public void testRotate1() throws Exception {

        int[][] array = new int[][]{

                {11 , 21 , 31, 41},
                {22,32,42,52},
                {33,43,53,63},
                {44,54,64,74}


        };

        int[][] array1 = new int[][]{

                {44 , 33 , 22, 11},
                {54,43,32,21},
                {64,53,42,31},
                {74,63,52,41}


        };

            int[][] rotate = r.rotate1(array);
            Assert.assertEquals(rotate[0][0] , array1[0][0]);
            Assert.assertEquals(rotate[0][2] , array1[0][2]);
            Assert.assertEquals(rotate[0][3] , array1[0][3]);
            Assert.assertEquals(rotate[0][1] , array1[0][1]);

    }
}