package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/12/16.
 */
public class WidthOfBinaryTree {

    public int findTheWidth(BinaryTreeNode node) {
        int width = 0;
        int levelSize = 0;
        if (node == null) {
            return width;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(node);
        BinaryTreeNode currentNode = node;


        while (!queue.isEmpty()) {
            levelSize = queue.size();
            width = (levelSize > width) ? levelSize : width;
            while (levelSize > 0) {
                currentNode = queue.poll();
                levelSize--;

                if (currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }

            }


        }
        return width;
    }
}