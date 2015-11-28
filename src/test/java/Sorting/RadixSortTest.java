package Sorting;

import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/25/2015.
 */
public class RadixSortTest {

    @Test
    public void testRadixSort() throws Exception {
        RadixSort radixSort = new RadixSort();
        int[] soretdArray = radixSort.radixSort(new int[]{2345, 11, 0,123, 234,0});

        assertTrue(Arrays.equals(soretdArray,new int[]{0,0,11,123,234,2345}));
    }
}