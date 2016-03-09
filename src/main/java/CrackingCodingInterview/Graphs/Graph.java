package CrackingCodingInterview.Graphs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by root on 1/26/16.
 */
public class Graph {
    int vertexCount;
    boolean[][] graphMatrix;
    Vertex[] vertices;
    int count = 0;
    Stack<Integer> theStack;
    Queue<Integer> theQueue ;


    public Graph(int vertexCount) {
        this.vertexCount = vertexCount;
        vertices = new Vertex[vertexCount];
        graphMatrix = new boolean[vertexCount][vertexCount];
        for(int i = 0 ; i<vertexCount ; i++){
            for (int j=0 ; j<vertexCount ;j++){
                graphMatrix[i][j] = false;
            }
        }
        theStack = new Stack<Integer>();
        theQueue = new LinkedList<Integer>();
    }

    public void addVertex(char vertexName){
        if(count < vertexCount) {
            vertices[count++] = new Vertex(vertexName);
        }
    }


    public void addEdge(int start, int end) {

        if (start >= 0 && start < vertexCount && end > 0 && end < vertexCount) {
            graphMatrix[start][end] = true;
            graphMatrix[end][start] = true;
        }


    }


    public void removeEdge(int start, int end) {
        if (start >= 0 && start < vertexCount && end > 0 && end < vertexCount) {
            graphMatrix[start][end] = false;
            graphMatrix[end][start] = false;
        }


    }

    public boolean isEdge(int start, int end) {

        if (start >= 0 && start < vertexCount && end > 0 && end < vertexCount) {
            return graphMatrix[start][end];
        }
        return false;
    }

    public void depthFirstSearch(){
        depthfirstSearch(0);
        for(int i = 0 ; i<vertices.length ; i++){
            if(!vertices[i].visited){
                depthfirstSearch(i);
            }
        }
    }

    private void depthfirstSearch(int index){
        if(!vertices[index].visited) {
            vertices[index].visited = true;
            System.out.println(vertices[index].label);

            for (int i = 0; i < vertexCount; i++) {
                if (graphMatrix[index][i]) {
                    theStack.push(i);
                }
            }
        }

        while(!theStack.isEmpty()){
            depthfirstSearch(theStack.pop());
        }

    }

    public void breadthFirstSearch(){
        breadthFirstSearch(0);
        for(int i = 0 ; i<vertices.length ; i++){
            if(!vertices[i].visited){
                breadthFirstSearch(i);
            }
        }
    }

    private  void breadthFirstSearch(int index) {
        if (!vertices[index].visited) {
            vertices[index].visited = true;
            System.out.println(vertices[index].label);


            for (int i = 0; i < vertexCount; i++) {
                if (graphMatrix[index][i]) {
                    theQueue.offer(i);
                }

            }
        }
        if (!theQueue.isEmpty()) {
            breadthFirstSearch(theQueue.poll());
        }


    }
}
