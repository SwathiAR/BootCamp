package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;

import static org.testng.Assert.*;

/**
 * Created by root on 1/13/16.
 */
public class ZigZagTraversalTest {

    ZigZagTraversal z = new ZigZagTraversal();

    @Test
    public void testTraverseZigZag() throws Exception {

        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);
        BinaryTreeNode left1 = new BinaryTreeNode(4);
        BinaryTreeNode left2 = new BinaryTreeNode(5);
        BinaryTreeNode right1 = new BinaryTreeNode(6);

        BinaryTreeNode r = new BinaryTreeNode(11);
        BinaryTreeNode r1 = new BinaryTreeNode(12);
        BinaryTreeNode r2 = new BinaryTreeNode(13);


        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        right.setLeft(right1);
        left1.setRight(r);
        r.setRight(r1);
        r1.setLeft(r2);


        LinkedList linkedList = z.traverseZigZag(root);
        LinkedList list = new LinkedList() {
            {
                add(1);
                add(3);
                add(2);
                add(4);
                add(5);
                add(6);
                add(11);
                add(12);
                add(13);
            }
        };

        Assert.assertEquals(linkedList.toString() , list.toString());

    }
}