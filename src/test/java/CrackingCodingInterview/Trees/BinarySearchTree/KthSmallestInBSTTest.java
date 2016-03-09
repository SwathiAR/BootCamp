package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/20/16.
 */
public class KthSmallestInBSTTest {
    KthSmallestInBST k = new KthSmallestInBST();

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
    public void testGetKthSmallestInBST() throws Exception {
        BinarySearchNode kthSmallestInBST = k.getKthSmallestInBST(root, 3);
        Assert.assertEquals((int)(Integer)kthSmallestInBST.getData() , 5);

    }
}