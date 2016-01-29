package CrackingCodingInterview.Graphs;

import CrackingCodingInterview.Lists.Node;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by root on 1/26/16.
 */
public class Graphs {
    int vertexCount;
    int count = 0;
    Stack<Node> theStack = new Stack<Node>();

    Vertex1[] vertices;
    private Queue<Node> theQueue = new LinkedList<Node>();

    public Graphs(int vertexCount) {
        this.vertexCount = vertexCount;
        vertices = new Vertex1[vertexCount];
    }

    public void addVertex(char vertexName) {
        vertices[count] = new Vertex1(vertexName, count++);


    }

    public void addEdge(int source, int destination) {
        if (source != -1 || destination != -1) {
            vertices[source].appendToTail(destination);


        }


    }

    public void removeEdge(int source, int destination) {
        if (source != -1 || destination != -1) {
            vertices[source].deleteNode(vertices[source], destination);


        }
    }

    public  void depthFirstSearch(){
        depthFirstSearch(0);
        for(int i = 0 ; i<vertexCount ; i++){
            if(!vertices[i].visited){
                depthFirstSearch(i);
            }
        }
    }

    private void depthFirstSearch(int index) {
       if( !vertices[index].visited){
           vertices[index].visited = true;
           System.out.println(vertices[index].label);
           Node temp = vertices[index];
           while(temp.getNext() != null){
               theStack.push(temp.getNext());
               temp = temp.getNext();
           }
       }

        if(!theStack.isEmpty()){
            depthFirstSearch(theStack.pop().getData());
        }


    }


    public void breadthFirstSearch(){
        breadthFirstSearch(0);
        for(int i = 0 ; i<vertexCount ; i++){
            if(!vertices[i].visited){
                breadthFirstSearch(i);
            }
    }

}

    private void breadthFirstSearch(int index) {

        if( !vertices[index].visited){
            vertices[index].visited = true;
            System.out.println(vertices[index].label);
            Node temp = vertices[index];
            while(temp.getNext() != null){
                theQueue.offer(temp.getNext());
                temp = temp.getNext();
            }
        }

        if(!theQueue.isEmpty()){
            breadthFirstSearch(theQueue.poll().getData());
        }

    }

    }
