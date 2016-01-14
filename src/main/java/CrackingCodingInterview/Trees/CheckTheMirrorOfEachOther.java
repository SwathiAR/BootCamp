package CrackingCodingInterview.Trees;

/**
 * Created by root on 1/13/16.
 */
public class CheckTheMirrorOfEachOther {

    public boolean isMirrorOfEachOther(BinaryTreeNode node1 , BinaryTreeNode node2){

        if(node1==null && node2 == null){
            return  true;
        }
        else if(node1==null || node2 == null){
            return false;
        }

        else if((Integer)node1.getData() != (Integer)node2.getData()){
            return false;
        }

       else   return  isMirrorOfEachOther(node1.getLeft() , node2.getRight()) && isMirrorOfEachOther(node1.getRight() , node2.getLeft());






    }
}
