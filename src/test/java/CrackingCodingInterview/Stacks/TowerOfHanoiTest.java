package CrackingCodingInterview.Stacks;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Stack;

import static org.testng.Assert.*;

/**
 * Created by root on 12/24/15.
 */
public class TowerOfHanoiTest {
    TowerOfHanoi t = new TowerOfHanoi();


    @Test
    public void testSolve() throws Exception {

        Tower[] towers = t.getTowers();
        Tower destination = t.solve(2);
        int peek = destination.disks.peek();
        Assert.assertEquals(peek , 1);
        Assert.assertEquals(towers[0].size() , 0);
        Assert.assertEquals(destination.size(), 2);

    }

    @Test
    public void testSolve1() throws Exception {

        Tower[] towers = t.getTowers();
        Tower destination = t.solve(12);
        int peek = destination.disks.peek();
        Assert.assertEquals(peek , 1);
        Assert.assertEquals(towers[0].size() , 0);
//        Assert.assertEquals(destination.size(), 12);

    }
}