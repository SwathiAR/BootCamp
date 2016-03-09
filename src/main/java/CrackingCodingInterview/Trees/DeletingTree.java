package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Stack;

/**
 * Created by root on 1/10/16.
 */
public class DeletingTree {

    public void deleteTree(BinaryTreeNode node) {
        BinaryTreeNode prev = null;
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        stack.push(node);
        while (!stack.isEmpty()) {
            BinaryTreeNode currentNode = stack.peek();

            if (prev == null || prev.getRight() == currentNode || prev.getLeft() == currentNode) {
                if(currentNode.getLeft() != null){
                    stack.push(currentNode.getLeft());
                }
                if(currentNode.getRight() != null){
                    stack.push(currentNode.getRight());
                }
            }
            else if(currentNode.getLeft() == prev){
                if(currentNode.getRight()!=null){
                    stack.push(currentNode.getRight());
                }
                else {
                    stack.pop();
                }


            }
            prev = currentNode;

            }


        }

    public void deleteTree1(BinaryTreeNode root){
        root = null; // In java it will be taken care by GC.
    }
    }
