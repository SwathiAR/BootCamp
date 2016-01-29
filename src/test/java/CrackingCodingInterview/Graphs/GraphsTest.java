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
 assertEquals(g.vertices[0].getNext().getData() ,1 );
        assertEquals(g.vertices[0].getNext().getNext().getData() ,2 );
        assertEquals(g.vertices[1].getNext().getData() ,3 );
        assertEquals(g.vertices[1].getNext().getNext().getData() ,4 );
        assertEquals(g.vertices[2].getNext().getData() ,4 );
        assertEquals(g.vertices[3].getNext().getData() ,5 );
        assertEquals(g.vertices[4].getNext().getData() ,5 );


    }

    @Test
    public void testRemoveEdge() throws Exception {
      g.addEdge(5 , 4);
        assertEquals(g.vertices[5].getNext().getData(), 4);
        g.removeEdge(5, 4);
        assertEquals(g.vertices[5].getNext() , null);

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