package CrackingCodingInterview.Trees.BinarySearchTree;

import java.util.ArrayList;

/**
 * Created by root on 1/17/16.
 */
public class ShortestPathBetween2NodesInBST {


    public ArrayList<BinarySearchNode> findShortestPath(BinarySearchNode root, BinarySearchNode node1, BinarySearchNode node2) {
        ArrayList<BinarySearchNode> list = new ArrayList<BinarySearchNode>();

        BinarySearchNode theLCA = findLCA(root, node1, node2);
         BinarySearchNode temp1 = theLCA;
        while (temp1 != null) {

            list.add(temp1);
            if ((Integer) node1.getData() < (Integer) temp1.getData()) {
                temp1 = temp1.getLeft();
            }
            if ((Integer) node1.getData() > (Integer) temp1.getData()) {
                temp1 = temp1.getRight();
            } else break;
        }
        int size = list.size();
        for (int i = 0; i < size / 2; i++) {
            BinarySearchNode temp = list.get(i);
            list.set(i, list.get(size - 1));
            list.set((size - 1), temp);
        }
        temp1 = theLCA;
        while (temp1 != null) {
            if(temp1!=theLCA) {
                list.add(temp1);
            }
            if ((Integer) node2.getData() < (Integer) temp1.getData()) {
                temp1 = temp1.getLeft();
            }
            else if ((Integer) node2.getData() > (Integer) temp1.getData()) {
                temp1 = temp1.getRight();
            } else break;
        }


        return list;

    }

    private BinarySearchNode findLCA(BinarySearchNode root, BinarySearchNode node1, BinarySearchNode node2) {


        if (root == null)
            return null;

        if (root == node1 || root == node2)
            return root;


        else {
            if ((Integer) root.getData() > Math.max((Integer) node1.getData(), (Integer) node2.getData()))
                findLCA(root.getLeft(), node1, node2);


            else if ((Integer) root.getData() < Math.min((Integer) node1.getData(), (Integer) node2.getData()))
                findLCA(root.getRight(), node1, node2);

            else return root;
        }
        return root;
    }

    }



