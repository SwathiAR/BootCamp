package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/18/16.
 */
public class CheckIfTreeIsBSTTest {
CheckIfTreeIsBST c = new CheckIfTreeIsBST()  ;
    BinarySearchNode root = new BinarySearchNode(7);
    BinarySearchNode left = new BinarySearchNode(4);
    BinarySearchNode right = new BinarySearchNode(9);
    BinarySearchNode left1 = new BinarySearchNode(2);
    BinarySearchNode left2 = new BinarySearchNode(5);


    BinarySearchNode rootO = new BinarySearchNode(7);
    BinarySearchNode leftO = new BinarySearchNode(4);
    BinarySearchNode rightO = new BinarySearchNode(9);
    BinarySearchNode left1O = new BinarySearchNode(2);
    BinarySearchNode left2O = new BinarySearchNode(5);

    @BeforeTest
    public  void befo() {

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);

        rootO.setLeft(leftO);
        rootO.setRight(rightO);
        leftO.setLeft(left2O);
        leftO.setRight(left1O);

    }

    @Test
    public void testIsBST() throws Exception {
        Assert.assertTrue(c.isBST(root));
        Assert.assertFalse(c.isBST(rootO));
        Assert.assertTrue(c.isBST2(root));
        Assert.assertFalse(c.isBST2(rootO));
        Assert.assertTrue(c.isBST3(root));
        Assert.assertFalse(c.isBST3(rootO));
    }
}