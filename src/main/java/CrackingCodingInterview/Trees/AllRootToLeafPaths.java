package CrackingCodingInterview.Trees;

import java.util.Stack;

/**
 * Created by root on 1/12/16.
 */
public class AllRootToLeafPaths {

    public static void main(String[] args){
        BinaryTreeNode root = new BinaryTreeNode(1);
        BinaryTreeNode left = new BinaryTreeNode(2);
        BinaryTreeNode right = new BinaryTreeNode(3);
        BinaryTreeNode left1 = new BinaryTreeNode(4);
        BinaryTreeNode left2 = new BinaryTreeNode(5);
        BinaryTreeNode right1 = new BinaryTreeNode(6);

        BinaryTreeNode r = new BinaryTreeNode(11);
        BinaryTreeNode r1 = new BinaryTreeNode(12);
        BinaryTreeNode r2 = new BinaryTreeNode(13);

        BinaryTreeNode l = new BinaryTreeNode(14);


        root.setLeft(left);
        root.setRight(right);
        left.setLeft(left1);
        left.setRight(left2);
        right.setLeft(right1);
        left1.setRight(r);
        r.setRight(r1);
        r1.setLeft(r2);

        printAllRootToLeafPaths(root);

    }


    public static void printAllRootToLeafPaths(BinaryTreeNode node) {
        int[] path = new int[256];
        int pathLength = 0;
        printRecursively(node, path, pathLength);
    }

    private static void printRecursively(BinaryTreeNode node, int[] path, int pathLength) {
        if (node == null) {
            return;
        }

        path[pathLength++] = (Integer) node.getData();
        if (node.getLeft() == null && node.getRight() == null) {
            printArray(path, pathLength);
        } else {
            printRecursively(node.getLeft(), path, pathLength);
            printRecursively(node.getRight(), path, pathLength);
        }

    }

    private static void printArray(int[] path, int pathLength) {
        for(int i = 0 ; i<pathLength-1;i++){
            System.out.print(path[i] + "-->");
        }
        System.out.println(path[pathLength-1]);
    }
}
