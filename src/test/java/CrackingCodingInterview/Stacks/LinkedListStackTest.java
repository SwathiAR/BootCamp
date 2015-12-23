package CrackingCodingInterview.Stacks;

import CrackingCodingInterview.Lists.Node;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/21/15.
 */
public class LinkedListStackTest {
    LinkedListStack l = new LinkedListStack();

    @Test
    public void testLLStack() throws Exception {
        l.push(2);
        Assert.assertEquals(l.length, 1);
        l.push(4);
        l.push(5);
        Assert.assertEquals(l.length, 3);
        Assert.assertEquals(l.pop().getData(), 5);
        Assert.assertEquals(l.length, 2);
        Assert.assertEquals(l.peek().getData(), 4);
        Assert.assertEquals(l.length, 2);
        Assert.assertFalse(l.isEmpty());



    }
}