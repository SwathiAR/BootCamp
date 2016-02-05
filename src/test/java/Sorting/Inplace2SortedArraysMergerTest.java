package Sorting;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by root on 2/4/16.
 */
public class Inplace2SortedArraysMergerTest {
    Inplace2SortedArraysMerger merger = new Inplace2SortedArraysMerger();
    int[] a;
    int[] b;
    @BeforeMethod
    public void setUp() throws Exception {
        a = new int[8];
        a[0] = 1;
        a[1] = 9;
        a[2] = 13;
        a[3] = 17;

       b = new int[4];
        b[0] = 2;
        b[1] = 8;
        b[2] = 10;
        b[3] = 16;

    }

    @Test
    public void testMerge() throws Exception {
        int[] merge = merger.merge(a, b);
        Assert.assertEquals(merge[0] , 1);
        Assert.assertEquals(merge[1] , 2);
        Assert.assertEquals(merge[2] , 8);
        Assert.assertEquals(merge[3] , 9);
        Assert.assertEquals(merge[4] , 10);
        Assert.assertEquals(merge[5] , 13);
        Assert.assertEquals(merge[6] , 16);
        Assert.assertEquals(merge[7] , 17);

    }
}