package CrackingCodingInterview.Graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by root on 2/1/16.
 */
public class BellmanFord {
    int[] distance;
    int[] path;
    Queue<Integer> theQueue = new LinkedList<Integer>();




    public  int[] findSinglSurceShortestPath(WeightedGraphs graphs , int s){
        distance = new int[(graphs.vertexCount)];
        path = new int[(graphs.vertexCount)];
        for(int i = 0 ; i<graphs.vertexCount ; i++){
            distance[i] = Integer.MAX_VALUE;
        }
        distance[s] =  0;


        for(int i = 0 ; i<(graphs.vertexCount-1); i++) {
            theQueue.offer(s);
            while (!theQueue.isEmpty()) {
                VertexwithWeightedEdge vertice = graphs.vertices[theQueue.poll()];
                for (Edge edge : vertice.adjacentWeightedEdges) {
                    if (distance[edge.getDestination().getData()] == Integer.MAX_VALUE || distance[edge.getDestination().getData()] > distance[(vertice.getData())] + edge.getWeight()) {
                        distance[edge.getDestination().getData()] = (distance[(vertice.getData())] + edge.getWeight());
                        path[(edge.getDestination().getData())] = (vertice.getData());
                    }
                    theQueue.offer(edge.getDestination().getData());

                }


            }
        }

            theQueue.offer(s);
            while(!theQueue.isEmpty()){
                VertexwithWeightedEdge vertice = graphs.vertices[theQueue.poll()];
                for(Edge edge : vertice.adjacentWeightedEdges){
                    if(distance[(edge.getDestination().getData())]==-1 || distance[(edge.getDestination().getData())] > distance[(vertice.getData())] + edge.getWeight()){
                        System.out.println("Found the negative cycle , shortest distance found is invalid");
                        break;
                    }


                }
                System.out.println("Distance from " + graphs.vertices[s].label + " are " );
                for(int i = 0 ; i<distance.length ; i++) {
                    if (distance[i] == Integer.MAX_VALUE){
                        System.out.println(graphs.vertices[i].label + " is  Infinity ");
                    } else {
                        System.out.println(graphs.vertices[i].label + " is " + distance[i] + " via " + graphs.vertices[path[i]].label);
                    }
                }




            }









        return  distance;

    }

}
