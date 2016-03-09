package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/9/16.
 */
public class SearchingTheTreeTest {
    SearchingTheTree s = new SearchingTheTree();

    @Test
    public void testSearchTheTree() throws Exception {

        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);
        BinaryTreeNode left1 = new BinaryTreeNode(4);
        BinaryTreeNode left2 = new BinaryTreeNode(5);
        BinaryTreeNode right1 = new BinaryTreeNode(6);

        BinaryTreeNode dummy = null;

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        right.setLeft(right1);


        Assert.assertEquals(s.searchTheTree(root, 4), true);
        Assert.assertEquals(s.searchTheTree(root ,  8) , false);
        Assert.assertEquals(s.searchTheTree(dummy ,  4) , false);

    }

    @Test
    public void testSearchTheTree2() throws Exception {

        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);
        BinaryTreeNode left1 = new BinaryTreeNode(4);
        BinaryTreeNode left2 = new BinaryTreeNode(5);
        BinaryTreeNode right1 = new BinaryTreeNode(6);

        BinaryTreeNode dummy = null;

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        right.setLeft(right1);


        Assert.assertEquals(s.searchTheTreeRecursionSimplified(root, 4), true);
        Assert.assertEquals(s.searchTheTreeRecursionSimplified(root, 8) , false);
        Assert.assertEquals(s.searchTheTreeRecursionSimplified(dummy, 4) , false);

    }

    @Test
    public void testSearchTheTree3() throws Exception {

        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);
        BinaryTreeNode left1 = new BinaryTreeNode(4);
        BinaryTreeNode left2 = new BinaryTreeNode(5);
        BinaryTreeNode right1 = new BinaryTreeNode(6);

        BinaryTreeNode dummy = null;

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        right.setLeft(right1);


        Assert.assertEquals(s.searchTheTreeWithoutRecursion(root, 4), true);
        Assert.assertEquals(s.searchTheTreeWithoutRecursion(root, 8) , false);
        Assert.assertEquals(s.searchTheTreeWithoutRecursion(dummy, 4) , false);

    }
}