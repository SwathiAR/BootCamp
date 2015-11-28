package Sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/25/2015.
 */
public class QuickSortTest {

    QuickSort m1 = new QuickSort();

    @Test
    public void testQuickSort() throws Exception {

        int[] a = m1.quickSort(new int[]{3, 6, 8, 2, 9} , 0 , 4);
        Assert.assertTrue(Arrays.equals(a, new int[]{2, 3, 6, 8, 9}));



    }

}