package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/12/16.
 */
public class StructurallyIdenticalTreesTest {

    StructurallyIdenticalTrees s = new StructurallyIdenticalTrees();

    @Test
    public void testCheckTheStructuralIdenticality() throws Exception {

        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);

        root.setLeft(left);
        root.setRight(right);


        BinaryTreeNode root1 = new BinaryTreeNode(1);
        BinaryTreeNode left1 = new BinaryTreeNode(2);
        BinaryTreeNode right1 = new BinaryTreeNode(3);


        root1.setLeft(left1);
        root1.setRight(right1);

        BinaryTreeNode root2 = new BinaryTreeNode(1);
        BinaryTreeNode left2 = new BinaryTreeNode(2);
        BinaryTreeNode right2 = new BinaryTreeNode(3);


        root2.setLeft(left2);




        Assert.assertEquals(s.checkTheStructuralIdenticality(root, root1), true);
        Assert.assertEquals(s.checkTheStructuralIdenticality(root , root2) , false);



    }
}