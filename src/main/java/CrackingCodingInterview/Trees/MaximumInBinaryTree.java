package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/9/16.
 */
public class MaximumInBinaryTree {

    public int findMaxInBinaryTree(BinaryTreeNode node) {
        int maxValue = Integer.MIN_VALUE;

        if (node != null) {

            int leftMax = findMaxInBinaryTree(node.getLeft());
            int rightMax = findMaxInBinaryTree(node.getRight());
            if (leftMax > (Integer) node.getData()) {
                if (leftMax > rightMax) {
                    return leftMax;
                } else {
                    return rightMax;
                }
            } else if (rightMax > (Integer) node.getData()) {
                if ( rightMax >  leftMax) {
                    return rightMax;
                } else {
                    return leftMax;
                }
            } else return (Integer) node.getData();


        }
        return maxValue;
    }

    public  int findMaxInBinaryTreeWithoutRecursion(BinaryTreeNode node){
        int max = Integer.MIN_VALUE;

        if(node==null){
            return max;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(node);

        while(!queue.isEmpty()){
            BinaryTreeNode temp = queue.poll();
            if((Integer)temp.getData() > max){
                max = (Integer)temp.getData();
            }
            if(temp.getLeft() != null){
                queue.offer(temp.getLeft());
            }

            if(temp.getRight() != null){
                queue.offer(temp.getRight());
            }
        }

        return  max;


    }
}
