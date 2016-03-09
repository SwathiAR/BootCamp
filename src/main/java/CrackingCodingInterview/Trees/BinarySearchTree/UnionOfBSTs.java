package CrackingCodingInterview.Trees.BinarySearchTree;

import java.util.TreeSet;

/**
 * Created by root on 1/21/16.
 */
public class UnionOfBSTs {
    int i = 0;

    public BinarySearchNode getUnionOFBSTS(BinarySearchNode node1 , BinarySearchNode node2){

        TreeSet<Integer> unionSet = getUnionTable(node1, node2);
        int length = unionSet.size();

        int[] array = new int[length];
        int i = 0;
        for(Integer setElement : unionSet){
            array[i++] = setElement;

        }
          return           buildBST(array , 0 , (length-1));

    }

    private BinarySearchNode buildBST(int[] array , int start , int end ) {
        if(start>end){
            return null;
        }
        int mid = start + ((end-start)/2);
        BinarySearchNode root = new BinarySearchNode(array[mid]);
        root.setLeft(buildBST(array , start , mid-1));
        root.setRight(buildBST(array , mid+1 , end));
        return root;
    }

    public TreeSet<Integer> getUnionTable(BinarySearchNode node1 , BinarySearchNode node2){
        TreeSet<Integer > set = new TreeSet<Integer>();
      inOrderTraversalOfOne(node1, set);
       inOrderTraversalOfOne(node2 , set);
     return set;
    }

    private TreeSet<Integer> inOrderTraversalOfOne(BinarySearchNode node ,  TreeSet<Integer > set) {
        if(node==null){
            return null;
        }
        inOrderTraversalOfOne(node.getLeft(), set);

            set.add((Integer) node.getData());

        inOrderTraversalOfOne(node.getRight(), set);
        return set;
    }
}
