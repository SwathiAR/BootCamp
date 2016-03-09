package CrackingCodingInterview.Trees;

/**
 * Created by root on 1/13/16.
 */
public class BTFromInorderAndPostorder {

    public BinaryTreeNode buildBinaryTree(char[] inorder, char[] postorder) {
        if (inorder.length == 0 || inorder.length != postorder.length) {

            return null;
        }

        return buildBT(inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1);
    }

    private BinaryTreeNode buildBT(char[] inorder, int inStart, int inEnd, char[] postorder, int postStart, int postEnd) {
        if (inStart > inEnd || postStart > postEnd) {
            return null;
        }

        BinaryTreeNode currentNode = new BinaryTreeNode(postorder[postEnd]);
        int i = inStart;
        for (; i < inEnd; i++) {
            if (inorder[i] == postorder[postEnd]) {
                break;
            }
        }
        currentNode.setLeft(buildBT(inorder, inStart, i - 1, postorder, postStart, postStart + i-inStart-1));
        currentNode.setRight(buildBT(inorder, i + 1, inEnd, postorder, postStart + i-inStart, postEnd - 1));

        return currentNode;

    }
}

