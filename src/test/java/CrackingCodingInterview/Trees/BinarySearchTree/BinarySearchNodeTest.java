package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/15/16.
 */
public class BinarySearchNodeTest {
    BinarySearchNode b = new BinarySearchNode(3);


    @Test
    public void testGetData() throws Exception {
   Assert.assertEquals(b.getData() , 3);
    }

    @Test
    public void testSetData() throws Exception {
      b.setData(4);
        Assert.assertEquals(b.getData(), 4);
    }





    @Test
    public void testGetRight() throws Exception {
        b.setRight(new BinarySearchNode(6));
        Assert.assertEquals(b.getRight().getData(), 6);
    }




    @Test
    public void testGetLeft() throws Exception {
        b.setLeft(new BinarySearchNode(1));
        Assert.assertEquals(b.getLeft().getData(), 1);
    }


}