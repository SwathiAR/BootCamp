package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/10/16.
 */
public class FindingSizeTest {

    FindingSize f = new FindingSize();

    @Test
    public void testFindSize() throws Exception {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);
        BinaryTreeNode left1 = new BinaryTreeNode(4);
        BinaryTreeNode left2 = new BinaryTreeNode(5);
        BinaryTreeNode right1 = new BinaryTreeNode(6);

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        right.setLeft(right1);


        Assert.assertEquals(f.findSize(root), 6);

    }

    @Test
    public void testFindSize1() throws Exception {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);
        BinaryTreeNode left1 = new BinaryTreeNode(4);
        BinaryTreeNode left2 = new BinaryTreeNode(5);
        BinaryTreeNode right1 = new BinaryTreeNode(6);

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        right.setLeft(right1);


        Assert.assertEquals(f.findSizeWithoutRecursion(root), 6);

    }
}