package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/13/16.
 */
public class BTFromInorderAndPreorderTest {

    BTFromInorderAndPreorder b = new BTFromInorderAndPreorder();

    @Test
    public  void testBTCreation() throws  Exception{

        char[] inorder = {'D' , 'B' , 'E' , 'A' , 'F' , 'C'};
        char[] preorder = {'A' , 'B' , 'D' , 'E' , 'C' , 'F'};
        BinaryTreeNode binaryTree = b.createBinaryTree(preorder, inorder);

        Assert.assertEquals((char)(Character)binaryTree.getData() , 'A');
        Assert.assertEquals((char)(Character)binaryTree.getLeft().getData() , 'B');
        Assert.assertEquals((char)(Character)binaryTree.getLeft().getLeft().getData() , 'D');

        Assert.assertEquals((char)(Character)binaryTree.getLeft().getRight().getData() , 'E');
       Assert.assertEquals((char)(Character)binaryTree.getRight().getData() , 'C');
        Assert.assertEquals((char)(Character)binaryTree.getRight().getLeft().getData() , 'F');

    }
}