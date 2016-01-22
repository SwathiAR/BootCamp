package CrackingCodingInterview.Trees.BinarySearchTree;

/**
 * Created by root on 1/20/16.
 */
public class KthSmallestInBST {
    int count = 0;
    public  BinarySearchNode getKthSmallestInBST(BinarySearchNode node , int kthNode ){
        if(node==null){
            return  null;
        }

        BinarySearchNode left =getKthSmallestInBST(node.getLeft() , kthNode );
        if(left!=null){
            return  left;
        }
        if(++count == kthNode){
            return node;
        }
       return getKthSmallestInBST(node.getRight() , kthNode );








    }

}
