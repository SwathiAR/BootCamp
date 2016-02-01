package CrackingCodingInterview.Graphs;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/30/16.
 */
public class WeightedGraphsTest {
    WeightedGraphs g = new WeightedGraphs(6);

    @BeforeTest
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
    public void testAddVertex() throws Exception {
        assertEquals(g.vertexCount, 6);
        assertEquals(g.vertices[0].index, 0);
        assertEquals(g.vertices[0].label, 'A');
        assertEquals(g.vertices[5].index, 5);
        assertEquals(g.vertices[5].label, 'F');
        assertEquals(g.vertices[2].index, 2);
        assertEquals(g.vertices[2].label, 'C');
    }

    @Test
    public void testAddEdge() throws Exception {
        assertEquals(g.vertices[0].adjacentWeightedEdges.contains(new Edge(g.vertices[1])), true);
        assertEquals(g.vertices[0].adjacentWeightedEdges.contains(new Edge(g.vertices[2])), true);
        assertEquals(g.vertices[1].adjacentWeightedEdges.contains(new Edge(g.vertices[3])), true);
        assertEquals(g.vertices[1].adjacentWeightedEdges.contains(new Edge(g.vertices[4])), true);
        assertEquals(g.vertices[2].adjacentWeightedEdges.contains(new Edge(g.vertices[4])), true);
        assertEquals(g.vertices[3].adjacentWeightedEdges.contains(new Edge(g.vertices[5])), true);
        assertEquals(g.vertices[4].adjacentWeightedEdges.contains(new Edge(g.vertices[5])), true);
        assertEquals(g.vertices[4].adjacentWeightedEdges.contains(new Edge(g.vertices[0])), false);

    }

    @Test
    public void testRemoveEdge() throws Exception {


        g.addEdge(5,  4 , 66);
        assertEquals(g.vertices[5].adjacentWeightedEdges.contains(new Edge(g.vertices[4])), true);
        g.removeEdge(5, 4);
        assertEquals(g.vertices[5].adjacentWeightedEdges.contains(new Edge(g.vertices[4])), false);

    }
}