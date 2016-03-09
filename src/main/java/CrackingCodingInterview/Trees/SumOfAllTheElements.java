package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/12/16.
 */
public class SumOfAllTheElements {

    public int indSumOfAllTheElements(BinaryTreeNode node){

        if(node==null){
            return Integer.MIN_VALUE;
        }

        return (Integer)node.getData() + indSumOfAllTheElements(node.getLeft()) + indSumOfAllTheElements(node.getRight());




    }

    public int sumWithoutRecursion(BinaryTreeNode node){
         int sum = 0;
        if(node == null){
            return  sum;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(node);
        while (!queue.isEmpty()){
            BinaryTreeNode temp = queue.poll();
            sum = sum +(Integer)temp.getData();
            if(temp.getLeft()!=null) {
                queue.offer(temp.getLeft());
            }
            if(temp.getRight()!=null) {
                queue.offer(temp.getRight());
            }

        }
        return sum;




    }
}


