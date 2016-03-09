package CrackingCodingInterview.Trees.AVLTree;

/**
 * Created by root on 1/22/16.
 */
public class RightLeft {
    RotateRight r = new RotateRight();
    RotateLeft l = new RotateLeft();

    public AVLTreeNode rotateRightLeft(AVLTreeNode root){

        AVLTreeNode rightChild = root.getRight();
        r.rotateRight(rightChild);
        AVLTreeNode avlTreeNode = l.rotateLeft(root);
        return avlTreeNode;


    }
}
