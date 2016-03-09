package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/12/16.
 */
public class FindTheNumberOfHalfnodes {
    public int findTheNumberOfHalfNodes(BinaryTreeNode node){
        int halfNode= 0;
        if (node == null) {
            return halfNode;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(node);
        BinaryTreeNode currentNode = node;


        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            if ((currentNode.getLeft()!= null && currentNode.getRight()== null) ||(currentNode.getRight()!= null && currentNode.getLeft()== null)) {
                halfNode++;
            }

            if (currentNode.getLeft() != null) {
                queue.offer(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.offer(currentNode.getRight());
            }


        }
        return halfNode;
    }

}

