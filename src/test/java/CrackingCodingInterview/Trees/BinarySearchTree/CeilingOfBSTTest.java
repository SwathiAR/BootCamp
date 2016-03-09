package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/21/16.
 */
public class CeilingOfBSTTest {
    CeilingOfBST c = new CeilingOfBST();
    BinarySearchNode root = new BinarySearchNode(7);
    BinarySearchNode left = new BinarySearchNode(4);
    BinarySearchNode right = new BinarySearchNode(9);
    BinarySearchNode left1 = new BinarySearchNode(2);
    BinarySearchNode left2 = new BinarySearchNode(5);
    BinarySearchNode right1 = new BinarySearchNode(8);
    BinarySearchNode right2 = new BinarySearchNode(11);

    BinarySearchNode test = new BinarySearchNode(6);
    BinarySearchNode test2 = new BinarySearchNode(10);


    @BeforeTest
    public  void befo() {

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        right.setLeft(right1);
        right.setRight(right2);
    }


    @Test
    public void testGetCeiling() throws Exception {
        BinarySearchNode ceiling = c.getCeiling(root, left);
       Assert.assertEquals((int) (Integer) ceiling.getData(), 4);
        BinarySearchNode ceil = c.getCeiling(root, right);
       Assert.assertEquals((int) (Integer) ceil.getData(), 9);
        BinarySearchNode ceiling1 = c.getCeiling(root, right1);
   Assert.assertEquals((int) (Integer) ceiling1.getData(), 8);
        BinarySearchNode ceiling2 = c.getCeiling(root, left2);
    Assert.assertEquals((int) (Integer) ceiling2.getData(), 5);
        BinarySearchNode ceiling3 = c.getCeiling(root, right2);
        Assert.assertEquals((int) (Integer) ceiling3.getData(), 11);
        BinarySearchNode ceiling4 = c.getCeiling(root, test);
       Assert.assertEquals((int) (Integer) ceiling4.getData(), 7);
        BinarySearchNode ceiling5 = c.getCeiling(root, test2);
   Assert.assertEquals((int)(Integer)ceiling5.getData() , 11);

    }

}