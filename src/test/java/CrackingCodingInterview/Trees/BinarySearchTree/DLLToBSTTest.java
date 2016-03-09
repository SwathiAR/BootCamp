package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/20/16.
 */
public class DLLToBSTTest {

    DLLToBST d = new DLLToBST();
    DLLNode node = new DLLNode(2);
    DLLNode node1 = new DLLNode(4);
    DLLNode node2 = new DLLNode(5);
    DLLNode node3 = new DLLNode(7);
    DLLNode node4 = new DLLNode(9);
    DLLNode node5 = new DLLNode(10);

    @BeforeTest
    public void beforeTest() {

        node.setPrev(null);
        node.setNext(node1);
        node1.setPrev(node);
        node1.setNext(node2);
        node2.setPrev(node1);
        node2.setNext(node3);
        node3.setPrev(node2);
        node3.setNext(node4);
        node4.setPrev(node3);
        node4.setNext(node5);
        node5.setPrev(node4);
        node5.setNext(null);
    }
    @Test
    public void testDLLtoBST() throws Exception {
        BinarySearchNode binarySearchNode = d.dLLtoBST(node);
        Assert.assertEquals((int)(Integer)binarySearchNode.getData() , 5);
        Assert.assertEquals((int)(Integer)binarySearchNode.getLeft().getData() , 2);
        Assert.assertEquals((int)(Integer)binarySearchNode.getLeft().getRight().getData() , 4);
        Assert.assertEquals((int)(Integer)binarySearchNode.getRight().getData() , 9);
        Assert.assertEquals((int)(Integer)binarySearchNode.getRight().getLeft().getData() , 7);
    }
}