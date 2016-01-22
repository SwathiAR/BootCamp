package CrackingCodingInterview.Trees.BinarySearchTree;

import java.util.Stack;

/**
 * Created by root on 1/18/16.
 */
public class CheckIfTreeIsBST {
    public boolean isBST(BinarySearchNode node) {
        if (node == null) {
            return true;
        } else {
            if (node.getLeft() != null && (Integer) findMax(node.getLeft()).getData() > (Integer) node.getData()) {
                return false;

            }

            if (node.getRight() != null && (Integer) findMin(node.getRight()).getData() < (Integer) node.getData()) {
                return false;

            }
        }
        return isBST(node.getLeft()) && isBST(node.getRight());


    }


    public BinarySearchNode findMax(BinarySearchNode node) {


        while (node.getRight() != null) {
            node = node.getRight();
        }
        return node;


    }

    public BinarySearchNode findMin(BinarySearchNode node) {


        while (node.getLeft() != null) {
            node = node.getLeft();
        }
        return node;


    }


    public boolean isBST2(BinarySearchNode node) {


        return isBST2(node, Integer.MIN_VALUE, Integer.MAX_VALUE);


    }

    private boolean isBST2(BinarySearchNode node, Integer min, Integer max) {

        if (node == null) {
            return true;
        }

        return (Integer) node.getData() > min && (Integer) node.getData() < max && isBST2(node.getLeft(), min, (Integer) node.getData()) && isBST2(node.getRight(), (Integer) node.getData(), max);


    }

    public boolean isBST3(BinarySearchNode node){
        Integer prev = Integer.MIN_VALUE;
        return  isBinSEarchTree(node , prev);

    }

    private boolean isBinSEarchTree(BinarySearchNode node , Integer prev) {
        if (node == null) {
            return true;
        }



        if (!isBinSEarchTree(node.getLeft() , prev)) {
            return false;
        }

        if ((Integer) node.getData() < prev) {
            return false;
        }
        prev = (Integer) node.getData();
         return isBinSEarchTree(node.getRight() , prev) ;

    }

}


