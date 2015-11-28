package Sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/24/2015.
 */
public class MergeSortTest {
    MergeSort m = new MergeSort();
    MergeSort m1 = new MergeSort();

    @Test
    public void testMergeSort() throws Exception {

        int[] a = m1.mergeSort(new int[]{3, 6, 8, 2, 9});
        Assert.assertTrue(Arrays.equals(a, new int[]{2, 3, 6, 8, 9}));



    }
}