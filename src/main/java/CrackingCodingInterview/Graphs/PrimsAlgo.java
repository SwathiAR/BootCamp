package CrackingCodingInterview.Graphs;

import CrackingCodingInterview.Heaps.MinHeap;

/**
 * Created by root on 2/1/16.
 */
public class PrimsAlgo {
    int[] distance;
    Edge[] path;
    MinHeap<Edge> theHeap;
    int indexPath = 0;


    public Edge[] giveMinimalSpanningTree(WeightedGraphs graphs) {

        distance = new int[graphs.vertexCount];
        path = new Edge[graphs.vertexCount];
        theHeap = new MinHeap(graphs.vertexCount);

        for (int i = 0; i < graphs.vertexCount; i++) {
            distance[i] = Integer.MAX_VALUE;
        }
        distance[0] = 0;
        graphs.vertices[0].visited = true;
        for (Edge edge : graphs.vertices[0].adjacentWeightedEdges) {
            theHeap.insert(edge);
        }
        while (theHeap.count != 0) {

            Edge edge1 = theHeap.deleteMin();
            if (!graphs.vertices[edge1.getDestination().getData()].visited) {
                graphs.vertices[edge1.getDestination().getData()].visited = true;
                path[indexPath++] = edge1;
                for (Edge edge : graphs.vertices[edge1.getDestination().getData()].adjacentWeightedEdges) {
                    theHeap.insert(edge);


                }
            }

        }

        for (int i = 0; i < graphs.vertexCount; i++) {
            if (!graphs.vertices[i].visited) {
                graphs.vertices[i].visited = true;

                for (Edge edge : graphs.vertices[i].adjacentWeightedEdges) {
                    theHeap.insert(edge);
                }
                path[indexPath++] = theHeap.deleteMin();
            }
            while(theHeap.count!=0){
                theHeap.deleteMin();
            }


        }
        for(Edge edge : path) {
            if (edge != null) {
                System.out.println(graphs.vertices[edge.getSource().getData()].label + " to " + graphs.vertices[edge.getDestination().getData()].label);
            }
        }
        return path;

    }
}
