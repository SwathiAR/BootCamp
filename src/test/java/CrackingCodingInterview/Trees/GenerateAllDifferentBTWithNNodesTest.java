package CrackingCodingInterview.Trees;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

/**
 * Created by root on 1/14/16.
 */
public class GenerateAllDifferentBTWithNNodesTest {

    GenerateAllDifferentBTWithNNodes g =new GenerateAllDifferentBTWithNNodes();

    @Test
    public void testGenerateTrees() throws Exception {

        ArrayList<BinaryTreeNode> binaryTreeNodes = g.generateTrees(3);
        Assert.assertEquals(binaryTreeNodes.size(), 5);
    }
}