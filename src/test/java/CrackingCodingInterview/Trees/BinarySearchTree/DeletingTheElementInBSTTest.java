package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/16/16.
 */
public class DeletingTheElementInBSTTest {
    DeletingTheElementInBST d = new DeletingTheElementInBST();
    BinarySearchNode root = new BinarySearchNode(15);
    BinarySearchNode left = new BinarySearchNode(5);
    BinarySearchNode right = new BinarySearchNode(20);
    BinarySearchNode left1 = new BinarySearchNode(3);
    BinarySearchNode left2 = new BinarySearchNode(7);
    BinarySearchNode left1a = new BinarySearchNode(2);
    BinarySearchNode left2a = new BinarySearchNode(4);
    BinarySearchNode left1b = new BinarySearchNode(6);
    BinarySearchNode left2b = new BinarySearchNode(9);

    BinarySearchNode right1 = new BinarySearchNode(18);
    BinarySearchNode right2 = new BinarySearchNode(23);

    @BeforeTest
    public  void befo() {

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        left1.setLeft(left1a);
        left1.setRight(left2a);
        left2.setLeft(left1b);
        left2.setRight(left2b);

        right.setLeft(right1);
        right.setRight(right2);
    }

    @Test
    public void testDelete() throws Exception {
        BinarySearchNode delete = d.delete(root, 5);
        Assert.assertEquals((int)(Integer)delete.getLeft().getData() , 6);
        BinarySearchNode delete1 = d.delete(root, 20);
        Assert.assertEquals((int)(Integer)delete.getRight().getData() , 23);

    }
}