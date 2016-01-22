package CrackingCodingInterview.Trees.BinarySearchTree;

/**
 * Created by root on 1/19/16.
 */
public class BST2CircularDLL {
    private BinarySearchNode lTail = null;

    public BinarySearchNode bST2DLL(BinarySearchNode node) {
        BinarySearchNode binarySearchNode = bST2DLLRecur(node);
        while(lTail.getLeft()!=null){
            lTail = lTail.getLeft();
        }
        binarySearchNode.setRight(lTail);
        lTail.setLeft(binarySearchNode);
        return lTail;
    }




    private BinarySearchNode bST2DLLRecur(BinarySearchNode node){
        if(node == null){
            lTail = null;
            return  null;
        }
        BinarySearchNode left;
        BinarySearchNode right ;

        left = bST2DLLRecur(node.getLeft());
        right = bST2DLLRecur(node.getRight());
        node.setLeft(left);
        node.setRight(lTail);

        if(left == null){
            lTail = node;
        }
        else {
            lTail = left;
            lTail.setRight(node);
        }

        if(right == null){
            return node;
        }
        else {
            right.setLeft(node);
            return right;
        }




    }
}
