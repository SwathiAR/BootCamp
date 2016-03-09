package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/20/16.
 */
public class sortedArrayToBSTTest {
    sortedArrayToBST s = new sortedArrayToBST();

    @Test
    public  void test() throws  Exception{
        BinarySearchNode binarySearchNode = s.arrayToBST(new int[]{2, 4, 5, 7, 9, 10});
        Assert.assertEquals((int)(Integer)binarySearchNode.getData() , 5);
        Assert.assertEquals((int)(Integer)binarySearchNode.getLeft().getData() , 2);
        Assert.assertEquals((int)(Integer)binarySearchNode.getLeft().getRight().getData() , 4);
        Assert.assertEquals((int)(Integer)binarySearchNode.getRight().getData() , 9);
        Assert.assertEquals((int)(Integer)binarySearchNode.getRight().getLeft().getData() , 7);
        Assert.assertEquals((int)(Integer)binarySearchNode.getRight().getRight().getData() , 10);




    }

}