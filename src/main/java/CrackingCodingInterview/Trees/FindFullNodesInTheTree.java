package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/12/16.
 */
public class FindFullNodesInTheTree {

    public int findTheFullNodesInTree(BinaryTreeNode node){
        int fullNode = 0;
        if (node == null) {
            return fullNode;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(node);
        BinaryTreeNode currentNode = node;


        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            if (currentNode.getLeft()!= null && currentNode.getRight()!= null) {
                fullNode++;
            }

                if (currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }


        }
        return fullNode;
    }







}
