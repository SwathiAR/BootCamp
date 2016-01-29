package CrackingCodingInterview.Graphs;

import CrackingCodingInterview.Lists.Node;

import java.util.LinkedList;

/**
 * Created by root on 1/27/16.
 */
public class Vertex1 extends Node {

    public  char label;
    public int index;
    public  boolean visited;
    public LinkedList<Vertex1> adjList  = new LinkedList<Vertex1>();
    public Vertex1(char label , int index ){
        super(index);
        this.index = super.data;
        this.label = label;
        this.visited = false;
    }


}
