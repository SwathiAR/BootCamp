package CrackingCodingInterview.Trees;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by root on 1/10/16.
 */
public class ReverseLevelOrder {

    public void revereseLevelOrder(BinaryTreeNode node){
        if(node==null){
            return;
        }
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
        queue.offer(node);
        while(!queue.isEmpty()){
            BinaryTreeNode temp = queue.poll();

            stack.push(temp);
            if(temp.getRight()!=null){
                queue.offer(temp.getRight());
            }
            if(temp.getLeft() != null){
                queue.offer(temp.getLeft());
            }

        }

        while(!stack.isEmpty()){
            System.out.println(stack.pop().getData());
        }


    }
}
