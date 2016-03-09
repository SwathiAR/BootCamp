package CrackingCodingInterview.Graphs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 1/27/16.
 */
public class GraphsTest {
    Graphs g = new Graphs(6);

    @BeforeTest
    public void setUp() throws Exception {

        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addVertex('E');
        g.addVertex('F');
        g.addEdge(0, 1);
        g.addEdge(0 , 2);
        g.addEdge(1 , 3);
        g.addEdge(1 , 4);
        g.addEdge(2 , 4);
        g.addEdge(3 , 5);
        g.addEdge(4 , 5);


    }

    @Test
    public void testAddVertex() throws Exception {
        assertEquals(g.vertexCount , 6);
        assertEquals(g.vertices[0].index , 0);
        assertEquals(g.vertices[0].label , 'A');
        assertEquals(g.vertices[5].index , 5);
        assertEquals(g.vertices[5].label , 'F');
        assertEquals(g.vertices[2].index , 2);
        assertEquals(g.vertices[2].label , 'C');

    }

    @Test
    public void testAddEdge() throws Exception {
 assertEquals(g.vertices[0].adjList.contains(g.vertices[1]) ,true );
        assertEquals(g.vertices[0].adjList.contains(g.vertices[2]) ,true );
        assertEquals(g.vertices[1].adjList.contains(g.vertices[3]) ,true );
        assertEquals(g.vertices[1].adjList.contains(g.vertices[4]) ,true );
        assertEquals(g.vertices[2].adjList.contains(g.vertices[4]) ,true);
        assertEquals(g.vertices[3].adjList.contains(g.vertices[5]) ,true );
        assertEquals(g.vertices[4].adjList.contains(g.vertices[5]) ,true );
        assertEquals(g.vertices[4].adjList.contains(g.vertices[0]) ,false );


    }

    @Test
    public void testRemoveEdge() throws Exception {
      g.addEdge(5, 4);
        assertEquals(g.vertices[5].adjList.contains(g.vertices[4]) ,true);
        g.removeEdge(5, 4);
        assertEquals(g.vertices[5].adjList.contains(g.vertices[4]) ,false);

    }

    @Test
    public void testDepthFirstSearch() throws Exception {
            g.depthFirstSearch();
    }

    @Test
    public void testBreadthFirstSearch() throws Exception {
   g.breadthFirstSearch();
    }
}