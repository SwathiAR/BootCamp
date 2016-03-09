package CrackingCodingInterview.Trees;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/10/16.
 */
public class ReverseLevelOrderTest {
ReverseLevelOrder r = new ReverseLevelOrder();
    @Test
    public void testReverselevelorder() throws Exception {


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

        r.revereseLevelOrder(root);

    }
}
