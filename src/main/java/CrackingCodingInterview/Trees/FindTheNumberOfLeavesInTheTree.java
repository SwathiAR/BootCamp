package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/11/16.
 */
public class FindTheNumberOfLeavesInTheTree {

    public int findTheNumberOfLeafNodes(BinaryTreeNode node) {
        int leafNode = 0;
        if (node == null) {
            return leafNode;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(node);
        BinaryTreeNode currentNode = node;


        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            if (currentNode.getLeft() == null && currentNode.getRight() == null) {
                leafNode++;
            } else {

                if (currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }
            }

        }
        return leafNode;
    }
}