package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/12/16.
 */
public class MaximumSumLevel {

    public int giveMaximumSumLevel(BinaryTreeNode node){
        int maxSum = 0;
        int levelSum = 0;
        int levelSize = 0;
        if (node == null) {
            return maxSum;
        }

        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(node);
        BinaryTreeNode currentNode = node;


        while (!queue.isEmpty()) {
            levelSize = queue.size();
             levelSum = 0;
            while (levelSize > 0) {
                currentNode = queue.poll();
                levelSum = levelSum + (Integer)currentNode.getData();
                levelSize--;

                if (currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }

            }
            maxSum = (levelSum>maxSum)?levelSum:maxSum;

        }
        return maxSum;








    }
}


