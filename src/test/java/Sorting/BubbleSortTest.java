package Sorting;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/24/2015.
 */
public class BubbleSortTest {
   BubbleSort bs = new BubbleSort();
    @Test
    public void testBubbleSort() throws Exception {

        Assert.assertEquals(bs.bubbleSort("swathi") , "ahistw");
        Assert.assertEquals(bs.bubbleSort("263754") , "234567");
        Assert.assertEquals(bs.bubbleSort("   ") , "   ");
        Assert.assertEquals(bs.bubbleSort("111") , "111");



    }
}