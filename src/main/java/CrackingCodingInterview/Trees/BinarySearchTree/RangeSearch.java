package CrackingCodingInterview.Trees.BinarySearchTree;

/**
 * Created by root on 1/22/16.
 */
public class RangeSearch {

    public void giveRange(BinarySearchNode root , BinarySearchNode node1 , BinarySearchNode node2){
        if(root==null)
        {
            return;
        }
        if((Integer)root.getData()>= (Integer)node1.getData()){
            giveRange(root.getLeft() , node1 , node2);
        }

        if((Integer)root.getData()> (Integer)node1.getData() && (Integer)root.getData()< (Integer)node2.getData()){
            System.out.println(root.getData());
        }
        if((Integer)root.getData()<= (Integer)node2.getData()){
            giveRange(root.getRight(), node1, node2);
        }




    }



}
