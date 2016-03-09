package CrackingCodingInterview.Graphs;

import CrackingCodingInterview.Lists.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by root on 1/30/16.
 */
public class WeightedGraphs {

    int vertexCount;
    int count = 0;
    Stack<Node> theStack = new Stack<Node>();

    VertexwithWeightedEdge[] vertices;
    private Queue<Node> theQueue = new LinkedList<Node>();

    public WeightedGraphs(int vertexCount) {
        this.vertexCount = vertexCount;
        vertices = new VertexwithWeightedEdge[vertexCount];
    }

    public void addVertex(char vertexName) {
        vertices[count] = new VertexwithWeightedEdge(vertexName, count++);


    }

    public void addEdge(int source, int destination , int weight) {
        if (source != -1 || destination != -1) {
            vertices[source].adjacentWeightedEdges.addFirst((new Edge(vertices[source] ,vertices[destination] , weight)));

        }


    }
    public void removeEdge(int source, int destination) {
        if (source != -1 || destination != -1) {

            vertices[source].adjacentWeightedEdges.remove(new Edge(vertices[source] ,vertices[destination]  ));


        }
    }


    }

