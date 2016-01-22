package CrackingCodingInterview.Trees.BinarySearchTree;

/**
 * Created by root on 1/21/16.
 */
public class CeilingOfBST {
    BinarySearchNode prev = null;

    public BinarySearchNode getCeiling(BinarySearchNode root , BinarySearchNode node){

        if(root == null){
            return  null;
        }

        BinarySearchNode right = getCeiling(root.getRight() , node);
        if((Integer)root.getData() == (Integer)node.getData()){
            return root;
        }
        else
        if((Integer)root.getData() < (Integer)node.getData()){
           return  (right==null)?right:((Integer)right.getData() < (Integer)node.getData())?null:right;
        }
        else
            prev = root;

        BinarySearchNode left = getCeiling(root.getLeft() , node);
        if(left!=null &&(Integer)left.getData()==node.getData()){
            prev = left;
            return left;
        }
        else
        if(left!=null){
            prev = left;
        }
        return prev;





    }

}
