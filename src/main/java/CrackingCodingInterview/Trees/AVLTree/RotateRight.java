package CrackingCodingInterview.Trees.AVLTree;

/**
 * Created by root on 1/22/16.
 */
public class RotateRight {



    public  AVLTreeNode rotateRight(AVLTreeNode x){

        AVLTreeNode w = x.getLeft();
        AVLTreeNode b = w.getRight();
        w.setRight(x);
        x.setLeft(b);
        x.setHeight(Math.max(findHeight(x.getRight()), findHeight(x.getLeft())) + 1);
        w.setHeight(Math.max(findHeight(w.getLeft()), findHeight(x)) + 1);
        return w;
    }

    public int findHeight(AVLTreeNode node){
        if(node==null){
            return -1;
        }
        else return node.getHeight();
    }
}

