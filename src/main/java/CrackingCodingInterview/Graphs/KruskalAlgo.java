package CrackingCodingInterview.Graphs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by root on 2/3/16.
 */
public class KruskalAlgo {

    List<Edge> allEdges = new ArrayList<Edge>();
    List<Edge> mST = new ArrayList<Edge>();
    VertexwithWeightedEdge[] vertices;
    DisJointSet disjointSet = new DisJointSet();


    public List<Edge> getMST(WeightedGraphs graphs) {
        vertices = graphs.vertices;

        for (int i = 0; i < graphs.vertexCount; i++) {
            disjointSet.makeSet(vertices[i].getData());
            for (Edge edge : vertices[i].adjacentWeightedEdges) {
                if (!allEdges.contains(edge)) {
                    allEdges.add(edge);
                }
            }
        }
        Collections.sort(allEdges);

        for(Edge edge : allEdges){
            if(disjointSet.findSet(edge.getSource().getData()) != disjointSet.findSet(edge.getDestination().getData()) ){
                disjointSet.unionSet(edge.getSource().getData() , edge.getDestination().getData());
                mST.add(edge);
            }
        }

        for(Edge edge : mST){
            System.out.println(edge.getSource().label + " to " + edge.getDestination().label);
        }
        return mST;

    }
}
