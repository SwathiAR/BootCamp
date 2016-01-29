package CrackingCodingInterview.Heaps;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/25/16.
 */
public class HeapTest {
    Heap h = new Heap(15);


    @BeforeMethod
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
    public void testInsert() throws Exception {
        Assert.assertEquals(h.array[0], 21);
        Assert.assertEquals(h.array[1], 11);
        Assert.assertEquals(h.array[2], 18);
        Assert.assertEquals(h.array[3], 10);
        Assert.assertEquals(h.array[4], 8);
        Assert.assertEquals(h.array[5], 12);
        Assert.assertEquals(h.array[6], 14);
       Assert.assertEquals(h.array[7], 1);
        Assert.assertEquals(h.array[8], 3);
        Assert.assertEquals(h.array[9], 2);
        Assert.assertEquals(h.array[10], 7);
        Assert.assertEquals(h.array[11], 5);

    }

    @Test
    public void testGetParent() throws Exception {
        Assert.assertEquals(h.getParent(4) , 1);
        Assert.assertEquals(h.getParent(3), 1);
        Assert.assertEquals(h.getParent(1) , 0);
        Assert.assertEquals(h.getParent(2) , 0);
        Assert.assertEquals(h.getParent(0) , -1);
        Assert.assertEquals(h.getParent(18) , -1);

    }

    @Test
    public void testGetleftChild() throws Exception {
        Assert.assertEquals(h.array[h.getleftChild(4)] , 2);
    }

    @Test
    public void testGetRightChild() throws Exception {
        Assert.assertEquals(h.array[h.getRightChild(4)] , 7);
    }

    @Test
    public void testGetMaximum() throws Exception {
        Assert.assertEquals(h.getMaximum() , 21);
    }

    @Test
    public void testPercolateDown() throws Exception {

    }

    @Test
    public void testDeleteMax() throws Exception {
        h.deleteMax() ;
        Assert.assertEquals(h.array[0], 18);
        Assert.assertEquals(h.array[1], 11);
        Assert.assertEquals(h.array[2], 14);
        Assert.assertEquals(h.array[3], 10);
        Assert.assertEquals(h.array[4], 8);
        Assert.assertEquals(h.array[5], 12);
        Assert.assertEquals(h.array[6], 5);
        Assert.assertEquals(h.array[7], 1);
        Assert.assertEquals(h.array[8], 3);
        Assert.assertEquals(h.array[9], 2);
        Assert.assertEquals(h.array[10], 7);
    }

}