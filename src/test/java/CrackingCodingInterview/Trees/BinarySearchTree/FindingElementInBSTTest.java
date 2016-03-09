package CrackingCodingInterview.Trees.BinarySearchTree;

import CrackingCodingInterview.Trees.BinaryTreeNode;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/15/16.
 */
public class FindingElementInBSTTest {
FindingElementInBST f = new FindingElementInBST();
    @Test
    public void testFind() throws Exception {

        BinarySearchNode root = new BinarySearchNode(7);
        BinarySearchNode left = new BinarySearchNode(4);
        BinarySearchNode right =new BinarySearchNode(9);
        BinarySearchNode left1 =new BinarySearchNode(2);
        BinarySearchNode left2 =new BinarySearchNode(5);


        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);

        Assert.assertEquals((int) (Integer) f.find(root, 9).getData(), 9);
        Assert.assertEquals((int)(Integer)f.findWithoutRecursion(root, 9).getData() , 9 );
        Assert.assertEquals((int)(Integer)f.find(root, 7).getData() , 7 );
        Assert.assertEquals((int)(Integer)f.findWithoutRecursion(root, 7).getData() , 7 );
    }
}