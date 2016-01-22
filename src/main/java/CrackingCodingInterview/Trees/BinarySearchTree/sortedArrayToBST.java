package CrackingCodingInterview.Trees.BinarySearchTree;

/**
 * Created by root on 1/20/16.
 */
public class sortedArrayToBST {


    public BinarySearchNode arrayToBST(int[] array){
        int length = array.length;


        return arrayToBST(array , 0 , length-1);


    }

    public BinarySearchNode arrayToBST(int[] array , int start , int end){

        if(start>end){
            return null;
        }

        if(start==end){
            return new BinarySearchNode(array[start]);
        }

        else {


            int mid = start + (end-start)/2;
            BinarySearchNode root = new BinarySearchNode(array[mid]);
            root.setLeft(arrayToBST(array , start , mid-1));
            root.setRight(arrayToBST(array , mid+1 , end));

return root;
        }


    }
}
