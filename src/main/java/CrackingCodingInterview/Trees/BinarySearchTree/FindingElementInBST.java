package CrackingCodingInterview.Trees.BinarySearchTree;

/**
 * Created by root on 1/15/16.
 */
public class FindingElementInBST {

    public BinarySearchNode find(BinarySearchNode root , int data){
        BinarySearchNode currentNode = root;
        if(root == null){
            return  null;
        }
        if((Integer)root.getData() == data){
            return currentNode;
        }

        return (Integer)root.getData()>data?find(root.getLeft() , data):find(root.getRight() , data);


    }
}
