package CrackingCodingInterview.Graphs;

import CrackingCodingInterview.Lists.Node;

import java.util.*;

/**
 * Created by root on 1/27/16.
 */
public class TopologicalSorter {
    HashMap<Integer, Integer> indegrees = new HashMap<Integer, Integer>();
    Queue<Node> theQueue = new LinkedList<Node>();

    public void sortInTopologicalOrder(Graphs g) {

        calculateIndigrees(g);

        for (int i = 0; i < g.vertexCount; i++) {
            if ((!indegrees.containsKey(g.vertices[i].getData())) || (indegrees.get(g.vertices[i].getData()) == 0)) {
                theQueue.offer(g.vertices[i]);
                System.out.println(g.vertices[i].label);
                Vertex1 temp = g.vertices[i];

                for (Vertex1 adjElements : temp.adjList) {
                    indegrees.put(adjElements.getData(), ((indegrees.get(adjElements.getData())) - 1));

                }
            }


        }

    }

    private void calculateIndigrees(Graphs g) {
        for (int i = 0; i < g.vertexCount; i++) {
            Vertex1 temp = g.vertices[i];


            for (Vertex1 adjElement : temp.adjList) {
                int indegreeCount = indegrees.containsKey(adjElement.getData()) ? (indegrees.get(adjElement.getData())) : 0;
                indegrees.put(adjElement.getData(), indegreeCount + 1);
            }


        }
    }
}
