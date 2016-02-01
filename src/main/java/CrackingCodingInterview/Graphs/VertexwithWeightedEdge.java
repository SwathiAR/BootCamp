package CrackingCodingInterview.Graphs;

import CrackingCodingInterview.Lists.Node;

import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by root on 1/30/16.
 */
public class VertexwithWeightedEdge extends Node{


    public  char label;
    public int index;
    public  boolean visited;
    public LinkedList<Edge> adjacentWeightedEdges = new LinkedList<Edge>();
    public VertexwithWeightedEdge(char label , int index ){
        super(index);
        this.index = super.data;
        this.label = label;
        this.visited = false;
    }

}
