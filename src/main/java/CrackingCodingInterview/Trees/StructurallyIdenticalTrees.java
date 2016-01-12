package CrackingCodingInterview.Trees;

/**
 * Created by root on 1/12/16.
 */
public class StructurallyIdenticalTrees {
    public boolean checkTheStructuralIdenticality(BinaryTreeNode node1 , BinaryTreeNode node2){

        if(node1 == null && node2==null){
            return true;
        }

        if(node1== null || node2==null){
            return false;
        }
        return checkTheStructuralIdenticality(node1.getLeft() , node2.getLeft()) && checkTheStructuralIdenticality(node1.getRight(),node2.getRight());





    }
}
