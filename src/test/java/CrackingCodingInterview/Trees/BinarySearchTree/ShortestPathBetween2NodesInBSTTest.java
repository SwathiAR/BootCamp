package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

/**
 * Created by root on 1/17/16.
 */
public class ShortestPathBetween2NodesInBSTTest {

    ShortestPathBetween2NodesInBST s = new ShortestPathBetween2NodesInBST();
    BinarySearchNode root = new BinarySearchNode(7);
    BinarySearchNode left = new BinarySearchNode(4);
    BinarySearchNode right = new BinarySearchNode(9);
    BinarySearchNode left1 = new BinarySearchNode(2);
    BinarySearchNode left2 = new BinarySearchNode(5);

    @BeforeTest
    public  void befo() {

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
    }
    @Test
    public void testFindMinElement() throws Exception {
        ArrayList<BinarySearchNode> shortestPath = s.findShortestPath(root, right, left2);
        Assert.assertEquals((int)(Integer)shortestPath.get(0).getData() , 9);
       Assert.assertEquals((int)(Integer)shortestPath.get(1).getData() , 7);
       Assert.assertEquals((int)(Integer)shortestPath.get(2).getData() , 4);
        Assert.assertEquals((int)(Integer)shortestPath.get(3).getData() , 5);

    }


    @Test
    public void testFindShortestPath() throws Exception {

    }
}