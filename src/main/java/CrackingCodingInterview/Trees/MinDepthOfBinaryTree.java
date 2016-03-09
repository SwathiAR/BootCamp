package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/11/16.
 */
public class MinDepthOfBinaryTree {


    public int findMinDepth(BinaryTreeNode node){
            if(node==null){
                return 0;
            }
            Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
            int level = -1;
            int levelSize = 1;
            queue.offer(node);
            BinaryTreeNode currentNode = node;
            while (!queue.isEmpty()){

                level++;
                levelSize = queue.size();
                while(levelSize>0){
                    currentNode = queue.poll();

                    if(currentNode.getLeft() == null && currentNode.getRight() == null){
                        return level;
                    }
                    if(currentNode.getLeft()!=null){
                        queue.offer(currentNode.getLeft());
                    }


                    if (currentNode.getRight() != null) {
                        queue.offer(currentNode.getRight());
                    }

                    levelSize--;

                }

            }

            return  level;
        }


public  int findMinDepthRecursively(BinaryTreeNode node){

    if(node==null){
        return -1;
    }
    int minLeft = findMinDepthRecursively(node.getLeft());
    int minRight = findMinDepthRecursively(node.getRight());

    return minLeft==-1?1+minRight : (minRight==-1?1+minLeft: (minLeft>minRight?1+minRight:1+minLeft));

}

    }

