package CrackingCodingInterview.Trees;

/**
 * Created by root on 1/13/16.
 */
public class LeastCommonAncestor {

public BinaryTreeNode findLCA(BinaryTreeNode root , BinaryTreeNode node1 , BinaryTreeNode node2){
    if(root == null){
        return  root;
    }

    if(root == node1 || root == node2){
        return root;
    }

    BinaryTreeNode left = findLCA(root.getLeft() , node1 , node2);
    BinaryTreeNode right = findLCA(root.getRight() , node1 , node2);

    if(left == null && right == null){
        return null;
    }

     if(left==null){
        return right;
    }
    if(right == null) {
        return left;
    }

    else return root;

}



}
