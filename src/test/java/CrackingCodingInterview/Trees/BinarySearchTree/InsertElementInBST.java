package CrackingCodingInterview.Trees.BinarySearchTree;

/**
 * Created by root on 1/15/16.
 */
public class InsertElementInBST {

    public BinarySearchNode insertElement(BinarySearchNode root , int data){
        BinarySearchNode node = new BinarySearchNode(data);

        if(root==null){
            return node;
        }

        while(root!=null){
            if((Integer)root.getData() == data){
                return root;
            }
            else if((Integer)root.getData() > data){
                if(root.getLeft() == null){
                    break;
                }
                root = root.getLeft();
            }
            else {
                if(root.getRight()==null) {
                    break;
                }
                    root = root.getRight();

            }

        }


        if((Integer)root.getData() > data){
            root.setLeft(node);
        }
        else root.setRight(node);

        return root;

    }

    public BinarySearchNode insertElementRecursively(BinarySearchNode root , int data) {

    if(root==null){
        root = new BinarySearchNode(data);
        root.setData(data);
        root.setLeft(null);
        root.setRight(null);
    }
        else if((Integer)root.getData() >data){
        root.setLeft(insertElementRecursively(root.getLeft() , data));

    }

        else root.setRight(insertElementRecursively(root.getRight() , data));

    return  root;
    }

}
