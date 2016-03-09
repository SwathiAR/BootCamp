package CrackingCodingInterview.Trees.AVLTree;

/**
 * Created by root on 1/22/16.
 */
public class AVLTreeInserter {
    RotateLeft l = new RotateLeft();
    RotateRight r = new RotateRight();

    public AVLTreeNode insert(AVLTreeNode root , int data) {

        if (root == null) {
            root = new AVLTreeNode(data);
            root.setHeight(0);
            root.setLeft(null);
            root.setRight(null);
            return root;
        }

        if ((Integer) root.getData() > data) {
            root.setLeft(insert(root.getLeft(), data));
            root.setHeight((Math.max(findHeight(root.getLeft()), findHeight(root.getRight()))) + 1);

        }
        else if ((Integer) root.getData() < data) {
            root.setRight(insert(root.getRight(), data));
            root.setHeight((Math.max(findHeight(root.getLeft()) , findHeight(root.getRight()))) +1);
        }

        if(Math.abs(findHeight(root.getLeft()) - findHeight(root.getRight())) == 2){
            if(findHeight(root.getRight()) > findHeight(root.getLeft())){
                if(findHeight(root.getRight().getRight()) > findHeight(root.getRight().getLeft())){
                    root=l.rotateLeft(root);
                }
                else {
                    root.setRight(r.rotateRight(root.getRight()));
                    root=l.rotateLeft(root);
                }
            }

            else {
                if (findHeight(root.getLeft().getLeft()) > findHeight(root.getLeft().getRight())) {
                    root=r.rotateRight(root);
                } else {
                    root.setLeft(l.rotateLeft(root.getLeft()));
                    root=r.rotateRight(root);
                }
            }



        }
        // if not avl {}
        return root;

    }

    public int findHeight(AVLTreeNode node){
        if(node==null){
            return -1;
        }
        else return node.getHeight();
    }
}
