package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/13/16.
 */
public class LeastCommonAncestorTest {

    LeastCommonAncestor l = new LeastCommonAncestor();

    @Test
    public void testLCA() throws  Exception{

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


        Assert.assertEquals((int) (Integer) l.findLCA(root, r, r1).getData(), 11);
        Assert.assertEquals((int)(Integer)l.findLCA(root , r , right).getData() , 1);
        Assert.assertEquals((int)(Integer)l.findLCA(root , left2 , left1).getData() , 2);
        Assert.assertEquals((int)(Integer)l.findLCA(root , left1 , right1).getData() , 1);



    }

}