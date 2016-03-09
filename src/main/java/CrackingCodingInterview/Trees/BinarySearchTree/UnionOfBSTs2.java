package CrackingCodingInterview.Trees.BinarySearchTree;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by root on 1/21/16.
 */
public class UnionOfBSTs2 {
    int i = 0;

    public BinarySearchNode getUnionOFBSTS(BinarySearchNode node1 , BinarySearchNode node2){
        ArrayList list = new ArrayList();
        ArrayList list2 = new ArrayList();
      inOrderTraversal(node1 , list );
        i = 0;
        inOrderTraversal(node2, list2);

        ArrayList<Integer> integers = mergeSort(list, list2);
        int size = integers.size();

        return buildBST(integers , 0 , size-1);
    }

    private BinarySearchNode buildBST(ArrayList<Integer> integers , int start , int end ) {
        if(start>end){
            return null;
        }
        BinarySearchNode root ;
        if(start==end){
            root = new BinarySearchNode(integers.get(start));
        }
  else {
            int mid = start + ((end - start) / 2);
            root = new BinarySearchNode(integers.get(mid));
            root.setLeft(buildBST(integers, start, mid - 1));
            root.setRight(buildBST(integers, mid + 1, end));
        }
        return root;

    }

    private ArrayList<Integer> mergeSort(ArrayList<Integer> list, ArrayList<Integer> list2) {
        int x=0 , y=0 , z = 0;
        ArrayList<Integer> result = new ArrayList<Integer>();
        while(x<list.size() && y<list2.size()) {
            if (list.get(x) <= list2.get(y)) {

                result.add(z, list.get(x));
                if (list.get(x) == list2.get(y)){
                    y++;
                }
               z++;
                x++;

            } else {
                result.add(z++, list2.get(y++));

            }
        }

        if(x<list.size()){
            while(x<list.size()){
            result.add(z++ ,list.get(x++));
        }
        }
        if(y<list2.size()){
            while(y<list2.size()) {
                result.add(z++, list2.get(y++));
            }
        }
        return  result;

    }

    private ArrayList<Integer> inOrderTraversal(BinarySearchNode node ,  ArrayList array) {
        if(node==null){
            return null;
        }
        inOrderTraversal(node.getLeft(), array);

        array.add(i++, (Integer) node.getData());

        inOrderTraversal(node.getRight(), array);
        return array;
    }
}
