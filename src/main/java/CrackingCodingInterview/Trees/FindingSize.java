package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/10/16.
 */
public class FindingSize {
    public int findSize(BinaryTreeNode node){
        if(node==null){
            return 0;
        }

        else{
            return 1+
            findSize(node.getLeft())+
            findSize(node.getRight());
        }
    }


    public int findSizeWithoutRecursion(BinaryTreeNode node){
       int totalSize = 0;
        if(node==null){
            return  totalSize;
        }
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(node);
        while(!queue.isEmpty()){
            totalSize++;
            BinaryTreeNode temp = queue.poll();

            if(temp.getLeft()!=null){
                queue.offer(temp.getLeft());
            }
            if(temp.getRight()!=null){
                queue.offer(temp.getRight());
            }

        }

        return  totalSize;


    }

}
