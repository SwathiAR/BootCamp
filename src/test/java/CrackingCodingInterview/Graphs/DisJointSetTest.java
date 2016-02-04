package CrackingCodingInterview.Graphs;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 2/3/16.
 */
public class DisJointSetTest {
    DisJointSet ds = new DisJointSet();

   @BeforeTest
    public void setUP() throws Exception {
   ds.makeSet(1);
        ds.makeSet(2);
        ds.makeSet(3);

        ds.makeSet(4);
        ds.makeSet(5);
        ds.makeSet(6);
        ds.makeSet(7);


        ds.unionSet(1,2);
        ds.unionSet(2,3);
        ds.unionSet(4,5);
        ds.unionSet(6,7);
        ds.unionSet(5,6);
        ds.unionSet(3,7);

    }

    @Test
    public void testFindSet() throws Exception {
        assertEquals(ds.findSet(1), 1);
        assertEquals(ds.findSet(2), 1);
        assertEquals(ds.findSet(3), 1);
        assertEquals(ds.findSet(4), 1);
        assertEquals(ds.findSet(5), 1);
        assertEquals(ds.findSet(6), 1);
        assertEquals(ds.findSet(7), 1);


    }
}