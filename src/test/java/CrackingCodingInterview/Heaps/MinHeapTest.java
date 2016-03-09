package CrackingCodingInterview.Heaps;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by root on 2/2/16.
 */
public class MinHeapTest {

    MinHeap h = new MinHeap(15);


    @BeforeTest
    public void setUp() throws Exception {
        h.insert(1);
        h.insert(5);
        h.insert(14);
        h.insert(2);
        h.insert(10);
        h.insert(21);
        h.insert(18);
        h.insert(3);
        h.insert(11);
        h.insert(8);
        h.insert(7);
        h.insert(12);

    }


    @Test
    public void test1Insert() throws Exception {
        Assert.assertEquals((h.array).get(0), 1);
        Assert.assertEquals(h.array.get(1), 2);
        Assert.assertEquals(h.array.get(2), 12);
        Assert.assertEquals(h.array.get(3), 3);
        Assert.assertEquals(h.array.get(4), 7);
        Assert.assertEquals(h.array.get(5), 14);
        Assert.assertEquals(h.array.get(6), 18);
        Assert.assertEquals(h.array.get(7), 5);
        Assert.assertEquals(h.array.get(8), 11);
        Assert.assertEquals(h.array.get(9), 10);
        Assert.assertEquals(h.array.get(10), 8);
        Assert.assertEquals(h.array.get(11), 21);

    }

    @Test
    public void test2GetParent() throws Exception {
        Assert.assertEquals(h.getParent(4), 1);
        Assert.assertEquals(h.getParent(3), 1);
        Assert.assertEquals(h.getParent(1), 0);
        Assert.assertEquals(h.getParent(2), 0);
        Assert.assertEquals(h.getParent(0), -1);
        Assert.assertEquals(h.getParent(18), -1);

    }

    @Test
    public void test3GetleftChild() throws Exception {
        Assert.assertEquals(h.array.get(h.getleftChild(4)), 10);
    }

    @Test
    public void test4GetRightChild() throws Exception {
        Assert.assertEquals(h.array.get(h.getRightChild(4)), 8);
    }

    @Test
    public void test5GetMinimum() throws Exception {
        Assert.assertEquals(h.getMinimum(), 1);
    }


    @Test
    public void test6DeleteMin() throws Exception {
        h.deleteMin();
        Assert.assertEquals(h.array.get(0), 2);
        Assert.assertEquals(h.array.get(1), 3);
        Assert.assertEquals(h.array.get(2), 12);
        Assert.assertEquals(h.array.get(3), 5);
        Assert.assertEquals(h.array.get(4), 7);
        Assert.assertEquals(h.array.get(5), 14);
        Assert.assertEquals(h.array.get(6), 18);
        Assert.assertEquals(h.array.get(7), 21);
        Assert.assertEquals(h.array.get(8), 11);
        Assert.assertEquals(h.array.get(9), 10);
        Assert.assertEquals(h.array.get(10), 8);
    }


}