package CrackingCodingInterview.Graphs;

import CrackingCodingInterview.Lists.Node;

/**
 * Created by root on 1/27/16.
 */
public class Vertex1 extends Node {

    public  char label;
    public int index;
    public  boolean visited;
    public Vertex1(char label , int index ){
        super(index);
        this.index = super.data;
        this.label = label;
        this.visited = false;
    }


}
