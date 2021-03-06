package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/11/16.
 */
public class DeepestNodeOfTheTree {

    public int findTheDeepestNodeOfTheTree(BinaryTreeNode node){
        if(node==null){
            return Integer.MIN_VALUE;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(node);
        BinaryTreeNode currentNode = node;

        while(!queue.isEmpty()){
            currentNode = queue.poll();
            if(currentNode.getLeft()!=null){
                queue.offer(currentNode.getLeft());
            }
            if(currentNode.getRight()!=null){
                queue.offer(currentNode.getRight());
            }

        }
        return (Integer)currentNode.getData();
    }
}
