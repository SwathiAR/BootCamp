package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/13/16.
 */
public class BTFromInorderAndPostorderTest {
    BTFromInorderAndPostorder b = new BTFromInorderAndPostorder();
    @Test
    public  void testBTCreation() throws  Exception{

        char[] inorder = {'D' , 'B' , 'E' , 'A' , 'F' , 'C'};
        char[] postorder = {'D' , 'E' , 'B' , 'F' , 'C' , 'A'};
        BinaryTreeNode binaryTree = b.buildBinaryTree( inorder , postorder);

        Assert.assertEquals((char) (Character) binaryTree.getData(), 'A');
        Assert.assertEquals((char)(Character)binaryTree.getLeft().getData() , 'B');
        Assert.assertEquals((char)(Character)binaryTree.getLeft().getLeft().getData() , 'D');

        Assert.assertEquals((char)(Character)binaryTree.getLeft().getRight().getData() , 'E');
        Assert.assertEquals((char)(Character)binaryTree.getRight().getData() , 'C');
        Assert.assertEquals((char)(Character)binaryTree.getRight().getLeft().getData() , 'F');

    }

}