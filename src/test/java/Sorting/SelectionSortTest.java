package Sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/24/2015.
 */
public class SelectionSortTest {
    SelectionSort s = new SelectionSort();

    @Test
    public void testSelectionSort() throws Exception {

                Assert.assertEquals(s.selectionSort("swathi"), "ahistw");
                Assert.assertEquals(s.selectionSort("263754") , "234567");
                Assert.assertEquals(s.selectionSort("   ") , "   ");
                Assert.assertEquals(s.selectionSort("111") , "111");



            }
        }
