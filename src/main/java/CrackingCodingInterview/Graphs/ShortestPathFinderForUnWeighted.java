package CrackingCodingInterview.Graphs;

import CrackingCodingInterview.Lists.Node;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/28/16.
 */
public class ShortestPathFinderForUnWeighted {
    int[] distance;
    int[] path;
    Queue<Integer> theQueue = new LinkedList<Integer>();
    public int[] findShortestPath(Graphs g , int s){
        distance = new int[g.vertexCount];
        path = new int[g.vertexCount];

        for(int i = 0 ; i< g.vertexCount ; i++){
            distance[i] = -1;
        }
        distance[s] = 0;
        theQueue.offer(s);

        while(!theQueue.isEmpty()) {
            Vertex1 vertice = g.vertices[theQueue.poll()];

            for (Vertex1 adjElement : vertice.adjList) {
                if ((distance[adjElement.getData()] == -1) || ((distance[adjElement.getData()]) > (distance[vertice.getData()] + 1))) {
                    distance[adjElement.getData()] = (distance[vertice.getData()] + 1);
                    path[adjElement.getData()] = vertice.getData();
                }
                theQueue.offer(adjElement.getData());
            }
        }

        System.out.println("Distance from " + g.vertices[s].label + " are " );
        for(int i = 0 ; i<distance.length ; i++) {
            if (distance[i] == -1) {
                System.out.println(g.vertices[i].label + " is  Infinity ");
            } else {
                System.out.println(g.vertices[i].label + " is " + distance[i] + " via " + g.vertices[path[i]].label);
            }
        }



    return distance;
    }


}
