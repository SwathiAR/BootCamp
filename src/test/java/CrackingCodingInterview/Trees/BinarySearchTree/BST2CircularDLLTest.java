package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by root on 1/19/16.
 */
public class BST2CircularDLLTest {
    BST2CircularDLL c = new BST2CircularDLL()  ;
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
    public void testBST2CircularDLL() throws Exception {
        BinarySearchNode binarySearchNode = c.bST2DLL(root);
        Assert.assertEquals(2, (int)(Integer) binarySearchNode.getData());

        Assert.assertEquals(4, (int) (Integer) binarySearchNode.getRight().getData());
        Assert.assertEquals(5, (int)(Integer) binarySearchNode.getRight().getRight().getData());
        Assert.assertEquals(7, (int)(Integer) binarySearchNode.getRight().getRight().getRight().getData());
        Assert.assertEquals(9, (int) (Integer) binarySearchNode.getRight().getRight().getRight().getRight().getData());

    }
}