package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/13/16.
 */
public class CheckTheMirrorOfEachOtherTest {

 CheckTheMirrorOfEachOther c = new CheckTheMirrorOfEachOther();
 MirrorOfBinaryTreeCreation m = new MirrorOfBinaryTreeCreation();
     @Test
    public void testIsMirrorOfEachOther() throws Exception {
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);

        root.setLeft(left);
        root.setRight(right);


         BinaryTreeNode mirror = new BinaryTreeNode(1);
         BinaryTreeNode mirrorLeft = new BinaryTreeNode(3);
         BinaryTreeNode mirrorRight = new BinaryTreeNode(2);

         mirror.setLeft(mirrorLeft);
         mirror.setRight(mirrorRight);



      Assert.assertTrue((c.isMirrorOfEachOther(mirror, root)));




    }
}