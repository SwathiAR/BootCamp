package CrackingCodingInterview.Heaps;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/25/16.
 */
public class HeapSorterTest {
    HeapSorter sorter = new HeapSorter();

    @Test
    public void testHeapSort() throws Exception {
        int[] array = new int[]{1, 8, 4, 6, 7};
        Heap heap = sorter.heapSort(array);
        Assert.assertEquals(heap.array[0], 8);
        Assert.assertEquals(heap.array[1], 7);
        Assert.assertEquals(heap.array[2], 4);
        Assert.assertEquals(heap.array[3], 6);
        Assert.assertEquals(heap.array[4], 1);

        int[] array2 = new int[]{3, 9, 61, 55, 42};
        Heap heap2 = sorter.heapSort(array2);
        Assert.assertEquals(heap2.array[0], 61);
        Assert.assertEquals(heap2.array[1], 55);
        Assert.assertEquals(heap2.array[2], 3);
        Assert.assertEquals(heap2.array[3], 9);
        Assert.assertEquals(heap2.array[4], 42);
    }
}