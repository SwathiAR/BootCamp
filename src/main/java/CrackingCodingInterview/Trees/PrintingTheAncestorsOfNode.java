package CrackingCodingInterview.Trees;

/**
 * Created by root on 1/13/16.
 */
public class PrintingTheAncestorsOfNode {

    public  static  void main(String args[]){

        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);
        BinaryTreeNode left1 = new BinaryTreeNode(4);
        BinaryTreeNode right1 = new BinaryTreeNode(5);

        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(right1);

        printTheAncestors(root , right1);
    }

    public static boolean printTheAncestors(BinaryTreeNode root , BinaryTreeNode node){
        if(root==null){
            return false;

        }
        if(root.getLeft()==node || root.getRight() == node || printTheAncestors(root.getLeft() , node) || printTheAncestors(root.getRight() , node)){
            System.out.println((Integer)root .getData());
            return true;
        }
        return false;
    }
}
