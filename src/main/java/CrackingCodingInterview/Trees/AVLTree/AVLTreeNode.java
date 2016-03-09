package CrackingCodingInterview.Trees.AVLTree;

/**
 * Created by root on 1/22/16.
 */
public class AVLTreeNode<T> {
    T data;
    AVLTreeNode left;
    AVLTreeNode right;
    int height;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public AVLTreeNode getLeft() {
        return left;
    }

    public void setLeft(AVLTreeNode left) {
        this.left = left;
    }

    public AVLTreeNode getRight() {
        return right;
    }

    public void setRight(AVLTreeNode right) {
        this.right = right;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public AVLTreeNode(T data) {
        this.data = data;
    }


}
