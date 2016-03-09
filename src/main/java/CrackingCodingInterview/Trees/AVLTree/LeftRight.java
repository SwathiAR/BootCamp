package CrackingCodingInterview.Trees.AVLTree;

/**
 * Created by root on 1/22/16.
 */
public class LeftRight {
    RotateLeft l = new RotateLeft();
    RotateRight r = new RotateRight();

    public AVLTreeNode leftRightRotate(AVLTreeNode root){
        AVLTreeNode leftChild = root.getLeft();
        l.rotateLeft(leftChild);
        AVLTreeNode avlTreeNode = r.rotateRight(root);
        return avlTreeNode;

    }
}
