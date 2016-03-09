package CrackingCodingInterview.Graphs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/29/16.
 */
public class ShortestPathFinderForUnWeightedTest {
    Graphs graph = new Graphs(7);

    ShortestPathFinderForUnWeighted shortestPathFinder = new ShortestPathFinderForUnWeighted();

    @BeforeMethod
    public void setUp() throws Exception {
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');
        graph.addVertex('G');

        graph.addEdge(0, 1);
        graph.addEdge(2 , 0);
        graph.addEdge(2 , 5);
        graph.addEdge(1, 3);
        graph.addEdge(1, 4);
        graph.addEdge(4, 6);
        graph.addEdge(3, 6);
        graph.addEdge(3, 5);
        graph.addEdge(6, 5);
        graph.addEdge(0, 3);


    }

    @Test
    public void testFindShortestPath() throws Exception {
        shortestPathFinder.findShortestPath(graph , 0);

    }
}