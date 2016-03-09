package CrackingCodingInterview.Trees.BinarySearchTree;

/**
 * Created by root on 1/15/16.
 */
public class DeletingTheElementInBST {


    public BinarySearchNode delete(BinarySearchNode node , int data){
       
if(node == null){
    return null;
}
         if((Integer)node.getData() > data){
            delete(node.getLeft(), data);
        }
else if((Integer)node.getData() < data){
             delete(node.getRight(), data);
         }

        else{
             if( (Integer)node.getData() == data){
                 if(node.getLeft() == null && node.getRight() == null){
                     node = null;
                 }
                 else if(node.getLeft() == null ){
                     node.setData((int)(Integer)node.getRight().getData());
                     BinarySearchNode next = node.getRight().getRight();
                     node.setRight(next);
                 }

                 else if( node.getRight() == null){
                     node.setData((int)(Integer)node.getLeft().getData());
                     BinarySearchNode next = node.getLeft().getLeft();
                     node.setLeft(next);
                 }
                 else {
                     BinarySearchNode temp  = node.getRight();
                     while(temp.getLeft()!=null){
                         temp = temp.getLeft();

                     }
                     int min = (Integer)temp.getData();
                     node.setData(min);
                     temp  = null;

                 }
             }







         }




return  node;
    }
}
