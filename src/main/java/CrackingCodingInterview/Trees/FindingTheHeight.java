package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by root on 1/10/16.
 */
public class FindingTheHeight {

    public int findTheHeight(BinaryTreeNode node){
        if(node==null){
            return  0;
        }
        int leftHeight = findTheHeight(node.getLeft());
        int rightHeight = findTheHeight(node.getRight());
        return 1 + (( leftHeight> rightHeight ) ? leftHeight : rightHeight);
    }


    public int findTheHeightWithStacks(BinaryTreeNode node){
        int height = 0;
        if(node==null){
            return  height;
        }
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        BinaryTreeNode prev = null;
        BinaryTreeNode currentnode = node;
        stack.push(node);
        while(!stack.isEmpty()){
            currentnode = stack.peek();

            if(prev==null || prev.getLeft() == currentnode || prev.getRight() == currentnode) {
                if (currentnode.getLeft() != null) {
                    stack.push(currentnode.getLeft());
                }

                else if (currentnode.getRight() != null) {
                    stack.push(currentnode.getRight());
                }
            }

            else if(currentnode.getLeft() == prev) {
                if (currentnode.getRight() != null) {
                    stack.push(currentnode.getRight());
                }
            }
            else{
                    height = (stack.size()>height)?stack.size():height;
                    stack.pop();
                }
            prev = currentnode;

            }

     return  height;

    }

    public int findTheHeightWithLevelOrder(BinaryTreeNode node){
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
}
