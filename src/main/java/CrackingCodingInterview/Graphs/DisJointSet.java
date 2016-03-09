package CrackingCodingInterview.Graphs;

import java.util.HashMap;

/**
 * Created by root on 2/3/16.
 */
public class DisJointSet {
    HashMap<Long , Node> map = new HashMap<Long, Node>();


     class Node{
        long data;
        int rank;
        Node parent;
    }

    public void makeSet(long data){
        Node node = new Node();
        node.data = data;
        node.rank = 0;
        node.parent = node;
        map.put(data , node);
    }

    public void unionSet(long data1 , long data2){
        Node parentOfdata1 = findSet(map.get(data1));
        Node parentOfdata2 = findSet(map.get(data2));
        if(parentOfdata1.equals(parentOfdata2)){
            return;
        }
        if( parentOfdata1.rank >= parentOfdata2.rank){
            parentOfdata2.parent = parentOfdata1;
            parentOfdata1.rank++;

        }
        else{
            parentOfdata1.parent = parentOfdata2;
            parentOfdata2.rank++;
        }


    }

    public long findSet(long data) {


        return findSet(map.get(data)).data;
    }
    public Node findSet(Node node){

       Node parent = node.parent;
        if(parent == node){
            return node;
        }
       node.parent = findSet(node.parent);
       return node.parent;




    }





}
