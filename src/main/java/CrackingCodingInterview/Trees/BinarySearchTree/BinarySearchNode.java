package CrackingCodingInterview.Trees.BinarySearchTree;

/**
 * Created by root on 1/15/16.
 */
public class BinarySearchNode<T> {


    BinarySearchNode left;
    BinarySearchNode right;
    T data ;

    public BinarySearchNode(T data){
        this.data = data;
    }
    public BinarySearchNode getRight() {
        return right;
    }

    public void setRight(BinarySearchNode right) {
        this.right = right;
    }

    public BinarySearchNode getLeft() {
        return left;
    }

    public void setLeft(BinarySearchNode left) {
        this.left = left;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }



}
