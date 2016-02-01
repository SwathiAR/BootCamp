package CrackingCodingInterview.Graphs;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 1/30/16.
 */
public class DigkstraAlgo {


    int[] distance;
    int[] path;
    Queue<Integer> theQueue = new LinkedList<Integer>();
    public int[] findShortestPath(WeightedGraphs g , int s){
        distance = new int[g.vertexCount];
        path = new int[g.vertexCount];

        for(int i = 0 ; i< g.vertexCount ; i++){
            distance[i] = -1;
        }
        distance[s] = 0;
        theQueue.offer(s);

        while(!theQueue.isEmpty()) {
            VertexwithWeightedEdge vertice = g.vertices[theQueue.poll()];

            for (Edge adjElement : vertice.adjacentWeightedEdges) {
                if ((distance[adjElement.getDestination().getData()] == -1) || ((distance[adjElement.destination.getData()]) > (distance[vertice.getData()] + adjElement.getWeight()))) {
                    distance[adjElement.destination.getData()] = (distance[vertice.getData()] + adjElement.getWeight());
                    path[adjElement.getDestination().getData()] = vertice.getData();
                }
                theQueue.offer(adjElement.getDestination().getData());
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
