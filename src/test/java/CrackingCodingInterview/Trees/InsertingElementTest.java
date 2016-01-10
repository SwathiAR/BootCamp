package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.IExecutionListener;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/9/16.
 */
public class InsertingElementTest {
InsertingElement i = new InsertingElement();
    @Test
    public void testInsertElement() throws Exception {

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

        i.insertElement(root, 9);
        int data = (Integer)root.getRight().getRight().getData();
        Assert.assertEquals(data , 9);

    }

    @Test
    public void testInsertElement1() throws Exception {

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

        i.insertElementRecursively(root, 9);
        int data = (Integer)root.getRight().getRight().getData();
        Assert.assertEquals(data , 9);

    }
}