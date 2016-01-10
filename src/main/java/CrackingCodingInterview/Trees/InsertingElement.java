package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/9/16.
 */
public class InsertingElement {

    public void insertElement(BinaryTreeNode node , int num){
        if(node==null){
            node = new BinaryTreeNode(num);
        }
        BinaryTreeNode nodeToInsert = new BinaryTreeNode(num);
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(node);

        while (!queue.isEmpty()){
            BinaryTreeNode temp = queue.poll();
            if(temp.getLeft()!=null){
                queue.offer(temp.getLeft());
            }
            else{
                temp.setLeft(nodeToInsert);
                return;
            }

            if(temp.getRight() != null){
                queue.offer(temp.getRight());
            }
            else {
                temp.setRight(nodeToInsert);
                return;
            }


        }

    }

public void insertElementRecursively(BinaryTreeNode node , int num){
    if(node == null){
        return;
    }

    if(node.getLeft()==null) {
        node.setLeft(new BinaryTreeNode(num));
    }
    else if(node.getRight()==null) {
        node.setRight(new BinaryTreeNode(num));
    }
    else{
        insertElementRecursively(node.getRight(), num);
    }


}

}
