package CrackingCodingInterview.Trees.BinarySearchTree;

/**
 * Created by root on 1/20/16.
 */
public class FloorInBST {
    BinarySearchNode prevTemp = null;

    public BinarySearchNode getFloor(BinarySearchNode root , BinarySearchNode node) {

        if (root == null) {
            return null;
        }

        BinarySearchNode prev = getFloor(root.getLeft(), node);
        if ((Integer) root.getData() == (Integer) node.getData()) {
            return root;
        }
        if ((Integer) root.getData() > (Integer) node.getData()) {
            return prev;
        }else prevTemp = root;
        BinarySearchNode next = getFloor(root.getRight(), node);
        if (next!=null && (Integer) next.getData() == (Integer) node.getData()) {

            return next;
        }
        if (next!=null && (Integer) next.getData() > (Integer) node.getData()) {

            return (Integer)prevTemp.getData() <(Integer)next.getData()?next:prevTemp;
        }


        else  return prevTemp;

    }
}
