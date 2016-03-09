package CrackingCodingInterview.Graphs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/28/16.
 */
public class TopologicalSorterTest {
    TopologicalSorter topologicalSorter = new TopologicalSorter();
   Graphs graph = new Graphs(12);
    @BeforeMethod
    public void setUp() throws Exception {

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');
        graph.addVertex('H');
        graph.addVertex('I');
        graph.addVertex('J');
        graph.addVertex('K');
        graph.addVertex('L');
        graph.addEdge(0, 3);
        graph.addEdge(1 , 3);
        graph.addEdge(0 , 4);
        graph.addEdge(1 , 4);
        graph.addEdge(2 , 4);
        graph.addEdge(3 , 5);
        graph.addEdge(3 , 7);
        graph.addEdge(4 , 6);
        graph.addEdge(4 , 7);
        graph.addEdge(5 , 8);
        graph.addEdge(6 , 8);
        graph.addEdge(8 , 9);
        graph.addEdge(8 , 10);
        graph.addEdge(8 , 11);
        graph.addEdge(7 , 8);

    }

    @Test
    public void testSortInTopologicalOrder() throws Exception {
topologicalSorter.sortInTopologicalOrder(graph);
    }
}