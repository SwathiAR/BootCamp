package CrackingCodingInterview.Trees.BinarySearchTree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/20/16.
 */
public class FloorInBSTTest {
    FloorInBST f = new FloorInBST();
    BinarySearchNode root = new BinarySearchNode(7);
    BinarySearchNode left = new BinarySearchNode(4);
    BinarySearchNode right = new BinarySearchNode(9);
    BinarySearchNode left1 = new BinarySearchNode(2);
    BinarySearchNode left2 = new BinarySearchNode(5);
    BinarySearchNode right1 = new BinarySearchNode(8);
    BinarySearchNode right2 = new BinarySearchNode(11);

    BinarySearchNode test = new BinarySearchNode(6);
    BinarySearchNode test2 = new BinarySearchNode(10);


    @BeforeTest
    public  void befo() {

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        right.setLeft(right1);
        right.setRight(right2);
    }


    @Test
    public void testGetFloor() throws Exception {
        BinarySearchNode floor = f.getFloor(root, left);
        Assert.assertEquals((int)(Integer)floor.getData() , 4);
        BinarySearchNode floor1 = f.getFloor(root, right1);
        Assert.assertEquals((int)(Integer)floor1.getData() , 8);
        BinarySearchNode floor2 = f.getFloor(root, left2);
        Assert.assertEquals((int)(Integer)floor2.getData() , 5);
        BinarySearchNode floor3 = f.getFloor(root, right2);
        Assert.assertEquals((int)(Integer)floor3.getData() , 11);
        BinarySearchNode floor4 = f.getFloor(root, test);
        Assert.assertEquals((int)(Integer)floor4.getData() , 5);
        BinarySearchNode floor5 = f.getFloor(root, test2);
        Assert.assertEquals((int)(Integer)floor5.getData() , 9);



    }
}