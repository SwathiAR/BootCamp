package CrackingCodingInterview.Trees.AVLTree;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/23/16.
 */
public class InsertionTest {


    private AVLTreeNode<Integer> root;
    private AVLTreeInserter avlTreeInserter;

    @BeforeMethod
    public void setUp() {
        avlTreeInserter = new AVLTreeInserter();
        root = new AVLTreeNode<Integer>(7);
        AVLTreeNode<Integer> left = new AVLTreeNode<Integer>(4);
        AVLTreeNode<Integer> right = new AVLTreeNode<Integer>(9);

        root.setLeft(left);
        root.setRight(right);

    }
    @Test
    public void testInsertOnRightRightScenario() throws Exception {
        avlTreeInserter.insert(root, 10);
        assertEquals((int) (Integer) root.getRight().getRight().getData(), 10);
        avlTreeInserter.insert(root, 11);
        assertEquals((int) (Integer) root.getRight().getRight().getData(), 11);
    }

@Test
    public void testInsertOnRightLeftScenario() throws Exception {
        avlTreeInserter.insert(root, 11);
        assertEquals( root.getRight().getData(), 9);
        assertEquals((int) (Integer) root.getRight().getRight().getData(), 11);
        avlTreeInserter.insert(root, 10);
        assertEquals((int) (Integer) root.getRight().getData(), 10);
        assertEquals((int) (Integer) root.getRight().getLeft().getData(), 9);
       assertEquals((int) (Integer) root.getRight().getRight().getData(), 11);
    }
@Test
    public void testInsertOnLeftLeftScenario() throws Exception {
        avlTreeInserter.insert(root, 2);
        assertEquals((int) (Integer) root.getLeft().getData(), 4);
        assertEquals((int) (Integer) root.getLeft().getLeft().getData(), 2);
        avlTreeInserter.insert(root, 1);
        assertEquals((int) (Integer) root.getLeft().getData(), 2);
        assertEquals((int) (Integer) root.getLeft().getRight().getData(), 4);
        assertEquals((int) (Integer) root.getLeft().getLeft().getData(), 1);
    }

@Test
    public void testInsertOnLeftRightScenario() throws Exception {
        avlTreeInserter.insert(root, 2);
        assertEquals((int) (Integer) root.getLeft().getData(), 4);
        assertEquals((int) (Integer) root.getLeft().getLeft().getData(), 2);
        avlTreeInserter.insert(root, 3);
        assertEquals((int) (Integer) root.getLeft().getData(), 3);
        assertEquals((int) (Integer) root.getLeft().getRight().getData(), 4);
        assertEquals((int) (Integer) root.getLeft().getLeft().getData(), 2);
    }
}