package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/15/16.
 */
public class MaxElementInBSTTest {

    MaxElementInBST m = new MaxElementInBST();
    BinarySearchNode root = new BinarySearchNode(7);
    BinarySearchNode left = new BinarySearchNode(4);
    BinarySearchNode right = new BinarySearchNode(9);
    BinarySearchNode left1 = new BinarySearchNode(2);
    BinarySearchNode left2 = new BinarySearchNode(5);

    @BeforeTest
    public  void befo() {

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
    }

    @Test
    public void testFindMax() throws Exception {
        Assert.assertEquals(m.findMax(root), 9);
    }

    @Test
    public void testFindMaxRecursively() throws Exception {
        Assert.assertEquals((int)(Integer)m.findMaxRecursively(root).getData() , 9);
    }
}