package CrackingCodingInterview.Trees.AVLTree;

/**
 * Created by root on 1/22/16.
 */
public class RotateLeft {

    public AVLTreeNode rotateLeft(AVLTreeNode x){
        AVLTreeNode w = x.getRight();
        AVLTreeNode b = w.getLeft();

        w.setLeft(x);
        x.setRight(b);
        x.setHeight(Math.max(findHeight(x.getLeft()), findHeight(x.getLeft())) + 1);
        w.setHeight(Math.max(findHeight(x) , findHeight(w.getRight())) + 1);
        return w;
    }

    public int findHeight(AVLTreeNode node){
        if(node==null){
            return -1;
        }
        else return node.getHeight();
    }




}
