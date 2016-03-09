package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/12/16.
 */
public class FindTheNumberOfLeavesInTheTreeTest {

    FindTheNumberOfLeavesInTheTree f = new FindTheNumberOfLeavesInTheTree();

    @Test
    public void findTheNumberOfLeaves() {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);
        BinaryTreeNode left1 = new BinaryTreeNode(4);
        BinaryTreeNode left2 = new BinaryTreeNode(5);
        BinaryTreeNode right1 = new BinaryTreeNode(6);

        BinaryTreeNode r = new BinaryTreeNode(11);
        BinaryTreeNode r1 = new BinaryTreeNode(12);
        BinaryTreeNode r2 = new BinaryTreeNode(13);

        BinaryTreeNode l = new BinaryTreeNode(14);


        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        right.setLeft(right1);
        left1.setRight(r);
        r.setRight(r1);
        r1.setLeft(r2);

        r.setLeft(l);


        Assert.assertEquals(f.findTheNumberOfLeafNodes(root) , 4);

    }
}