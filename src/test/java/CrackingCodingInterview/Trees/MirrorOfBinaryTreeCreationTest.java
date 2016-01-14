package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/13/16.
 */
public class MirrorOfBinaryTreeCreationTest {

    MirrorOfBinaryTreeCreation m = new MirrorOfBinaryTreeCreation();

    @Test
    public void testFindMirror() throws Exception {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);

        root.setLeft(left);
        root.setRight(right);

        BinaryTreeNode mirror = m.findMirror(root);

        Assert.assertEquals((int)(Integer)mirror.getData(), 1);
        Assert.assertEquals((int)(Integer)mirror.getLeft().getData(), 3);
        Assert.assertEquals((int)(Integer)mirror.getRight().getData(), 2);


    }
}