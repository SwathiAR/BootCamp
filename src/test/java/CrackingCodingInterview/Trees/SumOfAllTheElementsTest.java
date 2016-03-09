package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/12/16.
 */
public class SumOfAllTheElementsTest {
    SumOfAllTheElements s = new SumOfAllTheElements();
    @Test
            public void test() {

        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);

        root.setLeft(left);
        root.setRight(right);
        Assert.assertEquals(s.indSumOfAllTheElements(root), 6);
        Assert.assertEquals(s.sumWithoutRecursion(root) , 6);
    }
}