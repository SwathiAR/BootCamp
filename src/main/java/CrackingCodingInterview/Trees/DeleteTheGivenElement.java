package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/11/16.
 */
public class DeleteTheGivenElement {

    public  void deleteTheGivenElement(BinaryTreeNode node , BinaryTreeNode nodeToDelete){


    if(node==null || nodeToDelete==null){
        return ;
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
        int deepestNodeData = (Integer)currentNode.getData();

        queue.offer(node);
        while(!queue.isEmpty()) {
            currentNode = queue.poll();
            if (currentNode.getData() == nodeToDelete.getData()) {
                currentNode.setData(deepestNodeData);
            } else {

                if (currentNode.getLeft() != null) {
                    queue.offer(currentNode.getLeft());
                }
                if (currentNode.getRight() != null) {
                    queue.offer(currentNode.getRight());
                }

            }
        }
    }
}
