package CrackingCodingInterview.Trees.BinarySearchTree;

import java.util.prefs.BackingStoreException;

/**
 * Created by root on 1/15/16.
 */
public class MinumumElementInBST {
public int findMinElement(BinarySearchNode node ){
    if(node==null){
        return Integer.MAX_VALUE;
    }
    while(node.getLeft() != null){
        node = node.getLeft();
    }
    return  (Integer)node.getData();
}


    public BinarySearchNode findMinElementRecursively(BinarySearchNode node ){
        if(node==null){
            return null;
        }
        if(node.getLeft() == null){
            return  node;
        }
        return findMinElementRecursively(node.getLeft());
    }
}
