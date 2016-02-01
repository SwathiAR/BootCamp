package CrackingCodingInterview.Graphs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/30/16.
 */
public class DigkstraAlgoTest {
    WeightedGraphs g = new WeightedGraphs(6);
    DigkstraAlgo d = new DigkstraAlgo();

    @BeforeMethod
    public void setUp() throws Exception {
        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addVertex('E');
        g.addVertex('F');
        g.addEdge(0, 1, 4);
        g.addEdge(0, 2, 5);
        g.addEdge(1, 3, 6);
        g.addEdge(1, 4, 10);
        g.addEdge(2, 4, 7);
        g.addEdge(3, 5, 3);
        g.addEdge(4, 5, 2);

    }

    @Test
    public void testFindShortestPath() throws Exception {
d.findShortestPath(g , 0);
    }
}