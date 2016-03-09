package CrackingCodingInterview.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by root on 1/6/16.
 */
public class Traversal<T> {

    public void preOrderRecursiveTraversal(BinaryTreeNode node) {
        if (node == null) {
            return;
        } else
            System.out.println(node.getData());
        preOrderRecursiveTraversal(node.getLeft());
        preOrderRecursiveTraversal(node.getRight());
    }


    public LinkedList<Integer> preOrderIterativeTraversal(BinaryTreeNode node) {
        LinkedList<Integer> result = new LinkedList<Integer>();
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();

        stack.push(node);

        while (!(stack.isEmpty())) {
            BinaryTreeNode temp = stack.pop();
            result.add((Integer) temp.getData());
            if (temp.getRight() != null) {
                stack.push(temp.getRight());
            }
            if (temp.getLeft() != null) {
                stack.push(temp.getLeft());
            }

        }
        return result;

    }

    public void inOrderRecursiveTraversal(BinaryTreeNode node) {
        if (node != null) {
            inOrderRecursiveTraversal(node.getLeft());
            System.out.println(node.getData());
            inOrderRecursiveTraversal(node.getRight());


        }
    }

    public LinkedList<Integer> inorderIterativeTraversal(BinaryTreeNode node) {

        if (node == null) {
            return null;
        }
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        BinaryTreeNode currentNode = node;
        boolean done = false;
        while (!done) {
            while (currentNode != null) {
                stack.push(currentNode);
                currentNode = currentNode.getLeft();
            }

            if (stack.isEmpty()) {
                done = true;
            } else {
                linkedList.add((Integer) stack.peek().getData());
                currentNode = stack.pop().getRight();

            }


        }

        return linkedList;
    }


    public void recursivePostOrderTraversal(BinaryTreeNode node) {

        if (node != null) {
            recursivePostOrderTraversal(node.getLeft());
            recursivePostOrderTraversal(node.getRight());
            System.out.println(node.getData());

        }
    }

    public LinkedList<Integer> iterativePostOrderTraversal(BinaryTreeNode node) {
        if (node == null) {
            return null;
        }

        BinaryTreeNode prev = null;
        Stack<BinaryTreeNode> stack = new Stack<BinaryTreeNode>();
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        stack.push(node);

        while (!stack.isEmpty()) {
            BinaryTreeNode currentNode = stack.peek();

            if (prev == null || prev.getLeft() == currentNode || prev.getRight() == currentNode) {
                if (currentNode.getLeft() != null) {
                    stack.push(currentNode.getLeft());
                } else if (currentNode.getRight() != null) {
                    stack.push(currentNode.getRight());
                }
            } else if (currentNode.getLeft() == prev) {
                if (currentNode.getRight() != null) {
                    stack.push(currentNode.getRight());
                }
            }else {
                    linkedList.add((Integer) stack.pop().getData());
                }

                prev = currentNode;


            }

            return linkedList;

        }

public LinkedList<Integer> levelOrderIterativeTraversal(BinaryTreeNode node){

    if(node == null){
        return  null;
    }

    Queue<BinaryTreeNode> queue = new LinkedList<BinaryTreeNode>();
    LinkedList<Integer> linkedList = new LinkedList<Integer>();
    queue.offer(node);
    while (!queue.isEmpty()){
        BinaryTreeNode temp = queue.poll();
        linkedList.add((Integer) temp.getData());
        if(temp.getLeft()!=null) {
            queue.offer(temp.getLeft());
        }
        if(temp.getRight()!=null) {
            queue.offer(temp.getRight());
        }

    }
    return linkedList;




}
    }

