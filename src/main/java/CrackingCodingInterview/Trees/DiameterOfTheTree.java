package CrackingCodingInterview.Trees;

/**
 * Created by root on 1/12/16.
 */
public class DiameterOfTheTree {
    public  int findTheDiameterOfTheTree(BinaryTreeNode node){
        if(node==null){
            return 0;
        }
     int leftRadius =   findLong(node.getLeft());
     int rightRadius =   findLong(node.getRight());
        return  1 + leftRadius + rightRadius;
    }


    private int findLong(BinaryTreeNode node){

        if(node==null){
            return 0;
        }

        int leftRadius = findLong(node.getLeft());
        int rightRadius = findLong(node.getRight());

      return (1 + (leftRadius>rightRadius?leftRadius:rightRadius));
    }
}
