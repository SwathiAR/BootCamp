package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/15/16.
 */
public class InsertElementInBSTTest {
    InsertElementInBST i = new InsertElementInBST();
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
    public void testInsertElement() throws Exception {
        BinarySearchNode binarySearchNode = i.insertElement(root, 7);
        Assert.assertEquals((int) (Integer) binarySearchNode.getData(), 7);

        BinarySearchNode binarySearchNode1 = i.insertElement(root, 6);
        Assert.assertEquals((int) (Integer) binarySearchNode.getLeft().getRight().getRight().getData(), 6);
        BinarySearchNode binarySearchNode2 = i.insertElement(root, 3);
        Assert.assertEquals((int) (Integer) binarySearchNode.getLeft().getLeft().getRight().getData(), 3);

    }

    @Test
    public void testInsertElement1() throws Exception {
        BinarySearchNode binarySearchNode = i.insertElementRecursively(root, 7);
        Assert.assertEquals((int)(Integer)binarySearchNode.getData() , 7);

        BinarySearchNode binarySearchNode1 = i.insertElementRecursively(root, 6);
       Assert.assertEquals((int)(Integer)binarySearchNode.getLeft().getRight().getRight().getData() , 6);
        BinarySearchNode binarySearchNode2 = i.insertElementRecursively(root, 3);
        Assert.assertEquals((int)(Integer)binarySearchNode.getLeft().getLeft().getRight().getData() , 3);

    }

   @ Test
    public void testInsertElement3() throws Exception {
       BinarySearchNode binarySearchNode = i.insertElementRecursively(null, 7);
       Assert.assertEquals((int) (Integer) binarySearchNode.getData(), 7);
       i.insertElementRecursively(binarySearchNode, 6);
       Assert.assertEquals((int) (Integer) binarySearchNode.getLeft().getData(), 6);

   }
}