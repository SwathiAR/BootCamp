package CrackingCodingInterview.Stacks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/23/15.
 */
public class ThreeStacksFromSingleArray3Test {
    ThreeStacksFromSingleArray3 t = new ThreeStacksFromSingleArray3(2);

    @Test
    public void test() throws Exception{
        t.push(0 , 1);
        t.push(0 , 2);
        t.push(1,6);
        t.push(1,9);
        t.push(1, 7);

        Assert.assertEquals(t.pop(0), 2);
        Assert.assertEquals(t.pop(1), 7);
        Assert.assertEquals(t.top(1), 9);
        Assert.assertEquals(t.top(1), 9);
        Assert.assertEquals(t.top(0), 1);
        Assert.assertEquals(t.top(2), -1);

        t.push(1, 8);
        Assert.assertEquals(t.top(1), 8);
        Assert.assertEquals(t.pop(1), 8);

        t.push(0, 4);
        t.push(0, 1);
        t.push(2, 5);
        Assert.assertEquals(t.top(0), 1);
        Assert.assertEquals(t.top(2), 5);








    }

}