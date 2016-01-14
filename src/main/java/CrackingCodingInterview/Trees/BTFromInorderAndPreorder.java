package CrackingCodingInterview.Trees;

/**
 * Created by root on 1/13/16.
 */
public class BTFromInorderAndPreorder {

    public BinaryTreeNode createBinaryTree(char[] preorder , char[]inorder){
        if(preorder.length==0 || inorder.length!=preorder.length){
            return null;
        }

        return  createBinTree(preorder , 0 , preorder.length-1 , inorder , 0 , inorder.length-1);




    }

     private BinaryTreeNode createBinTree(char[] preOrder , int preStart , int preEnd , char[] inOrder , int inStart , int inEnd){
         if(preStart>preEnd || inStart>inEnd){
             return null;
         }

         BinaryTreeNode currentNode = new BinaryTreeNode(preOrder[preStart]);
         int i = inStart;
         for(; i<inOrder.length ; i++){
             if(inOrder[i] == preOrder[preStart]){
                 break;
             }
         }
         currentNode.setLeft(createBinTree(preOrder , preStart+1 , preEnd , inOrder , 0 , i-1));
         currentNode.setRight(createBinTree(preOrder , preStart+1+i , preEnd , inOrder , i+1 , inOrder.length-1));

         return currentNode;

    }


}
