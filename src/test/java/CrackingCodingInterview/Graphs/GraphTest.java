package CrackingCodingInterview.Graphs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/26/16.
 */
public class GraphTest {

    Graph g = new Graph(4);

    @BeforeMethod
    public void testAddEdge() throws Exception {
        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addEdge(0, 1);

        g.addEdge(1, 2);
        g.addEdge(3, 2);

    }

    @Test
    public void testRemoveEdge() throws Exception {
        g.addEdge(1, 3);
        assertEquals(g.graphMatrix[1][3], true);
        g.removeEdge(1 , 3);
        assertEquals(g.graphMatrix[1][3] , false);
    }

    @Test
    public void testIsEdge() throws Exception {
        assertEquals(g.isEdge(1,3) , false);
        assertEquals(g.isEdge(3,2) , true);
    }

    @Test
    public void testAddVertex() throws Exception {
       assertEquals(g.vertices[0].label , 'A');
        assertEquals(g.vertices[1].label , 'B');
        assertEquals(g.vertices[2].label , 'C');
        assertEquals(g.vertices[3].label , 'D');

    }

    @Test
    public void testDepthfirstSearch() throws Exception {
          g.depthFirstSearch();
    }

    @Test
    public void testBreadthFirstSearch() throws Exception {
        g.breadthFirstSearch();
    }
}