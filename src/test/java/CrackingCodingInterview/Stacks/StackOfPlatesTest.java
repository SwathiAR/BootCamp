package CrackingCodingInterview.Stacks;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by root on 12/23/15.
 */
public class StackOfPlatesTest {

    StackOfPlates s = new StackOfPlates(5);

    @Test
    public void test() throws  Exception{
        s.push(8);
        s.push(7);
        s.push(9);
        s.push(12);
        s.push(3);
        s.push(1);
        s.push(33);
        s.push(66);
        Assert.assertEquals(s.top(), 66);
        Assert.assertEquals(s.pop(), 66);
        Assert.assertEquals(s.top(), 33);
        s.push(12);
        Assert.assertEquals(s.top(), 12);
        s.push(7);
        s.push(4);
        s.push(56);
        Assert.assertEquals(s.top(), 56);
        Assert.assertEquals(s.pop(), 56);
        s.push(8);
        s.push(7);
        s.push(9);
        s.push(12);
        s.push(3);
        s.push(1);
        s.push(33);
        s.push(66);
        Assert.assertEquals(s.pop(), 66);
        Assert.assertEquals(s.popAt(3) , 33);
        Assert.assertEquals(s.popAt(2) , 3);
        Assert.assertEquals(s.popAt(1) , 4);
        Assert.assertEquals(s.popAt(2) , 1);
       Assert.assertEquals(s.popAt(1) , 8);




    }

}