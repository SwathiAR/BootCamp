package CrackingCodingInterview.Trees;

import java.util.HashMap;

/**
 * Created by root on 1/14/16.
 */
public class VerticalSum {

    public void vSum(BinaryTreeNode node){
        HashMap<Integer , Integer> hashMap = new HashMap<Integer, Integer>();
        verticalSum(node , hashMap , 0);

        for(int k : hashMap.keySet()){
            System.out.println("key(pos):" +k+ " sum " + hashMap.get(k)+ "" );
        }




    }

    private void verticalSum(BinaryTreeNode node, HashMap<Integer, Integer> hashMap, int c) {

        if(node.getLeft()!=null){
            verticalSum(node.getLeft() , hashMap , c-1);
        }

        if(node.getRight()!=null){
            verticalSum(node.getRight() , hashMap , c+1);
        }

        int data = 0;
        if(hashMap.containsKey(c)){
            data = hashMap.get(c);
        }

        hashMap.put(c , data+(Integer)node.getData());




    }
}
