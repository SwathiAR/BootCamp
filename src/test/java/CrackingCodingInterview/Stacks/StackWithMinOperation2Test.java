package CrackingCodingInterview.Stacks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/23/15.
 */
public class StackWithMinOperation2Test {
    StackWithMinOperation2 s = new StackWithMinOperation2();

    @Test
    public void testPush() throws Exception {
//        s.push(9);
//        s.push(8);
//        s.push(4);
//        s.push(1);
//        s.push(6);
//        s.push(1);
//
//        Assert.assertEquals(s.peek(), 1);
//        Assert.assertEquals(s.min() , 1);
//        Assert.assertEquals(s.pop() , 1);
//        Assert.assertEquals(s.pop() , 6);
//        Assert.assertEquals(s.min() , 1);

        s.push(4);
        s.push(8);
        s.push(6);
        s.push(7);
        s.push(1);

        Assert.assertEquals(s.peek(), 1);
        Assert.assertEquals(s.min() , 1);
        Assert.assertEquals(s.pop() , 1);
        Assert.assertEquals(s.min() , 4);
        Assert.assertEquals(s.pop() , 7);
        Assert.assertEquals(s.min() , 4);
    }
}