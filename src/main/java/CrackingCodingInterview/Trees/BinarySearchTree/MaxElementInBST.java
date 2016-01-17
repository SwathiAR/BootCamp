package CrackingCodingInterview.Trees.BinarySearchTree;

/**
 * Created by root on 1/15/16.
 */
public class MaxElementInBST {

    public int findMax(BinarySearchNode node ){


        if(node == null){
            return  Integer.MIN_VALUE;
        }

        while(node.getRight()!=null){

            node = node.getRight();
        }

        return  (Integer)node.getData();
    }



    public  BinarySearchNode findMaxRecursively(BinarySearchNode node ){
        if(node==null){
            return null;
        }
        else if(node.getRight() == null){
            return  node;
        }
        return findMaxRecursively(node.getRight());






    }
}
