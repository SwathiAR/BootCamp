package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/9/16.
 */
public class SearchingTheTree {

    public boolean searchTheTree(BinaryTreeNode node, int num) {
        if (node != null) {

            if ((Integer) node.getData() == num) {
                return true;

            } else {
                boolean b = searchTheTree(node.getLeft(), num);
                if (b) {
                    return true;
                }
                boolean b1 = searchTheTree(node.getRight(), num);
                if (b1) {
                    return true;
                }
            }

        }
        return false;
    }

    public boolean searchTheTreeRecursionSimplified(BinaryTreeNode node, int num) {

        if (node != null) {

            if ((Integer) node.getData() == num) {
                return true;
            } else return searchTheTree(node.getLeft(), num) || searchTheTree(node.getRight(), num);

        }
        return false;


    }

    public boolean searchTheTreeWithoutRecursion(BinaryTreeNode node, int num) {
        if (node != null) {

            Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
            queue.offer(node);
            while (!queue.isEmpty()) {
                BinaryTreeNode temp = queue.poll();
                if ((Integer) temp.getData() == num) {
                    return true;
                }
                if (temp.getLeft() != null) {
                    queue.offer(temp.getLeft());
                }
                if (temp.getRight() != null) {
                    queue.offer(temp.getRight());
                }


            }


        }
        return false;

    }
}
