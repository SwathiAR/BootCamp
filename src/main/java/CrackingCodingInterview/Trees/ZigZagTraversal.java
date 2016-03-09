package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by root on 1/13/16.
 */
public class ZigZagTraversal {


    public LinkedList traverseZigZag(BinaryTreeNode node){

        Stack<BinaryTreeNode> stack1 = new Stack();
        Stack<BinaryTreeNode> stack2 = new Stack();
        stack1.push(node);
        LinkedList<Integer> list = new LinkedList<Integer>();

        while(!stack1.isEmpty() || !stack2.isEmpty()){
            while (!stack1.isEmpty()){
                BinaryTreeNode currentNode = stack1.pop();
                list.add((Integer) currentNode.getData());
                if(currentNode.getLeft()!= null){
                    stack2.push(currentNode.getLeft());
                }

                if(currentNode.getRight()!= null){
                    stack2.push(currentNode.getRight());
                }



            }

            while (!stack2.isEmpty()){

                BinaryTreeNode currentNode = stack2.pop();
                list.add((Integer) currentNode.getData());


                if(currentNode.getRight()!= null){
                    stack1.push(currentNode.getRight());
                }
                if(currentNode.getLeft()!= null){
                    stack1.push(currentNode.getLeft());
                }











            }
        }




      return  list;

    }



}
