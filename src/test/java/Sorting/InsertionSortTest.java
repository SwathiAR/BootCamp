package Sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/25/2015.
 */
public class InsertionSortTest {

    InsertionSort i = new InsertionSort();

    @Test
    public void testInsertionSort() throws Exception {
        Assert.assertTrue(Arrays.equals(i.insertionSort(new int[]{2, 6 ,7 , 3 ,8 , 1}) , new int[]{1,2,3,6,7,8}));

    }
}