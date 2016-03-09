package CrackingCodingInterview.Graphs;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

/**
 * Created by root on 2/4/16.
 */
public class RouteExistenceCheckerTest {
    Graphs g;
    RouteExistenceChecker r;

    @BeforeMethod
    public void setUp() throws Exception {
         g= new Graphs(6);
        r = new RouteExistenceChecker();
        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addVertex('E');
        g.addVertex('F');
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
    }

    @Test
    public void testFindRoute() throws Exception {
        List<Vertex1> route = r.findRoute(g, g.vertices[1], g.vertices[4]);
        assertEquals(route.get(0).getData() , 1);
        assertEquals(route.get(1).getData() , 3);
        assertEquals(route.get(2).getData() , 5);
        assertEquals(route.get(3).getData() , 4);

    }


    @Test
    public void testFindRoute1() throws Exception {
        List<Vertex1> route = r.findRoute(g, g.vertices[2], g.vertices[0]);
        assertNull(route);
    }
}