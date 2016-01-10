package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by root on 1/6/16.
 */
public class TraversalTest {



Traversal t = new Traversal();
    @Test
    public void testPreOrderRecursiveTraversal() throws Exception {

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

        t.preOrderRecursiveTraversal(root);

    }



    @Test
    public void testPreOrderIterativeTraversal() throws Exception {
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

        LinkedList linkedList = t.preOrderIterativeTraversal(root);
        Assert.assertEquals(linkedList, new LinkedList() {{
            add(1);
            add(2);
            add(4);
            add(5);
            add(3);
            add(6);
        }});
        Assert.assertEquals(linkedList.toString(), "[1, 2, 4, 5, 3, 6]");

    }

    @Test
    public void testInOrderRecursiveTraversal() throws Exception {
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


       t.inOrderRecursiveTraversal(root);

    }

    @Test
    public void testInorderIterativeTraversal() throws Exception {
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

        LinkedList linkedList = t.inorderIterativeTraversal(root);

        Assert.assertEquals(linkedList.toString(), "[4, 2, 5, 1, 6, 3]");

    }


    @Test
    public void testpostOrderRecursiveTraversal() throws Exception {
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


        t.recursivePostOrderTraversal(root);

    }
    @Test
    public void testPostorderIterativeTraversal() throws Exception {
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

        LinkedList linkedList = t.iterativePostOrderTraversal(root);

        Assert.assertEquals(linkedList.toString(), "[4, 5, 2, 6, 3, 1]");

    }


    @Test
    public void testLevelOrderIterativeTraversal() throws Exception {
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

        LinkedList linkedList = t.levelOrderIterativeTraversal(root);

        Assert.assertEquals(linkedList.toString(), "[1, 2, 3, 4, 5, 6]");

    }
}