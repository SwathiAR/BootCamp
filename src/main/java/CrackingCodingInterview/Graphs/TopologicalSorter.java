package CrackingCodingInterview.Graphs;

import CrackingCodingInterview.Lists.Node;

import java.util.*;

/**
 * Created by root on 1/27/16.
 */
public class TopologicalSorter {
    HashMap<Integer , Integer> indegrees = new HashMap<Integer, Integer>();
    Queue<Node> theQueue = new LinkedList<Node>();
    public void sortInTopologicalOrder(Graphs g){

        calculateIndigrees(g);

        for(int i = 0 ; i<g.vertexCount ; i++){
            if((!indegrees.containsKey(g.vertices[i].getData())) || (indegrees.get(g.vertices[i].getData()) == 0)) {
                theQueue.offer(g.vertices[i]);
                System.out.println(g.vertices[i].label);
                 Node temp = g.vertices[i];
               while(temp.getNext()!=null){
                  indegrees.put(temp.getNext().getData() , (indegrees.get(temp.getNext().getData())-1));
                   temp = temp.getNext();
               }
            }


        }










    }

    private void calculateIndigrees(Graphs g) {
        for(int i = 0 ; i<g.vertexCount ; i++){
            Node temp = g.vertices[i];
            while(temp.getNext() != null){
               int indegreeCount= indegrees.containsKey(temp.getNext().getData())? (indegrees.get(temp.getNext().getData())):0;
               indegrees.put(temp.getNext().getData() , indegreeCount+1);
                temp = temp.getNext();

            }


        }
    }
}
