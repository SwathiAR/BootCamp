package CrackingCodingInterview.Stacks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/20/15.
 */
public class DynamicArrayStackTest {
    DynamicArrayStack d = new DynamicArrayStack();

    @Test
    public void testDAS() throws Exception {
        d.push(8);
        d.push(7);
        d.push(9);
        d.push(6);
        d.push(2);

        Assert.assertEquals(d.size(), 5);
        Assert.assertEquals(d.pop(), 2);
        Assert.assertEquals(d.size(), 4);
        Assert.assertEquals(d.top(), 6);
        Assert.assertEquals(d.size(), 4);


    }
}