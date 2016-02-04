package CrackingCodingInterview.Graphs;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by root on 2/4/16.
 */
public class RouteExistenceChecker {
    Stack<Vertex1> theStack = new Stack<Vertex1>();
    List<Vertex1> pathOfVetices = new ArrayList<Vertex1>();
    boolean pathExists = false;

    public List<Vertex1> findRoute(Graphs graphs, Vertex1 start, Vertex1 end) {


        for (Vertex1 vertex : graphs.vertices) {
            vertex.visited = false;
        }
        start.visited = true;
        theStack.push(start);
         pathOfVetices.add(start);
        while (!theStack.isEmpty()) {
            Vertex1 tempVertex = theStack.pop();
            if (!tempVertex.visited) {
                pathOfVetices.add(tempVertex);
                tempVertex.visited = true;
                if (tempVertex == end) {
                    pathExists = true;
                    break;
                }
            }
            for (Vertex1 vertex1 : tempVertex.adjList) {
                theStack.push(vertex1);
            }

        }




    if(pathExists) {


        for (Vertex1 v : pathOfVetices) {
            System.out.println(v.label);
        }
    }
        else {
        System.out.println("No route found");
    }



    return pathExists?pathOfVetices:null;


}
}
