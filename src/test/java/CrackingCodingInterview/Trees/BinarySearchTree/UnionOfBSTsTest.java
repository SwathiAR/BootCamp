package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/21/16.
 */
public class UnionOfBSTsTest {
    UnionOfBSTs u = new UnionOfBSTs();
    BinarySearchNode root = new BinarySearchNode(7);
    BinarySearchNode left = new BinarySearchNode(4);
    BinarySearchNode right = new BinarySearchNode(9);
    BinarySearchNode left1 = new BinarySearchNode(2);
    BinarySearchNode left2 = new BinarySearchNode(5);
    BinarySearchNode right1 = new BinarySearchNode(8);
    BinarySearchNode right2 = new BinarySearchNode(11);

    BinarySearchNode root1 = new BinarySearchNode(17);
    BinarySearchNode left11 = new BinarySearchNode(13);
    BinarySearchNode right11 = new BinarySearchNode(18);
    BinarySearchNode left111 = new BinarySearchNode(11);
    BinarySearchNode left211 = new BinarySearchNode(14);


    @BeforeTest
    public  void befo() {

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        right.setLeft(right1);
        right.setRight(right2);

        root1.setLeft(left11);
        root1.setRight(right11);
        left11.setLeft(left111);
        left11.setRight(left211);
    }


    @Test
    public void testGetUnionOFBSTS() throws Exception {
        BinarySearchNode unionOFBSTS = u.getUnionOFBSTS(root, root1);
        Assert.assertEquals((int)(Integer)unionOFBSTS.getData() , 9);
        Assert.assertEquals((int)(Integer)unionOFBSTS.getLeft().getData() , 5);
        Assert.assertEquals((int)(Integer)unionOFBSTS.getRight().getData() , 14);
       Assert.assertEquals((int)(Integer)unionOFBSTS.getLeft().getLeft().getData() , 2);
        Assert.assertEquals((int)(Integer)unionOFBSTS.getLeft().getLeft().getRight().getData() , 4);
        Assert.assertEquals((int)(Integer)unionOFBSTS.getLeft().getRight().getData() , 7);
        Assert.assertEquals((int)(Integer)unionOFBSTS.getLeft().getRight().getRight().getData() , 8);
    }
}