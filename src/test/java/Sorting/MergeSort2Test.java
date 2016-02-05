package Sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by root on 2/4/16.
 */
public class MergeSort2Test {
    MergeSort2 m = new MergeSort2();

    @Test
    public void testDoMergeSort() throws Exception {
        int[] ints = m.doMergeSort(new int[]{3, 6, 8, 2, 9});
Assert.assertEquals(ints[0] , 2 );
        Assert.assertEquals(ints[1] , 3 );
        Assert.assertEquals(ints[2] , 6 );
        Assert.assertEquals(ints[3] , 8 );
        Assert.assertEquals(ints[4] , 9 );

    }
}