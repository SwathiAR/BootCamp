package CrackingCodingInterview.Trees;

/**
 * Created by root on 1/12/16.
 */
public class MirrorOfBinaryTreeCreation {
public BinaryTreeNode findMirror(BinaryTreeNode node){
    if(node==null){
        return node;
    }

    findMirror(node.getLeft());
    findMirror(node.getRight());

    BinaryTreeNode temp = node.getLeft();
    node.setLeft(node.getRight());
    node.setRight(temp);

    return node;
}

}