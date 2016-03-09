package CrackingCodingInterview.Trees;

import java.util.ArrayList;

/**
 * Created by root on 1/14/16.
 */
public class GenerateAllDifferentBTWithNNodes {
    public ArrayList<BinaryTreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }


    private ArrayList<BinaryTreeNode> generateTrees(int start, int end) {
        ArrayList<BinaryTreeNode> subTree = new ArrayList<BinaryTreeNode>();
        if (start > end) {
            subTree.add(null);
            return subTree;
        }

        for (int i = start; i <= end; i++) {
            for (BinaryTreeNode left : generateTrees(start, i - 1)) {
                for (BinaryTreeNode right : generateTrees(i + 1, end)) {

                    BinaryTreeNode root = new BinaryTreeNode(i);
                    root.setLeft(left);
                    root.setRight(right);
                    subTree.add(root);

                }

            }

        }
        return subTree;
    }
}
