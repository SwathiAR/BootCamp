package CrackingCodingInterview.Stacks;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by root on 12/22/15.
 */
public class ThreeStacksfromSingleArrayTest {
    ThreeStacksfromSingleArray1 t = new ThreeStacksfromSingleArray1();

    @Test
    public void test() throws Exception {
        t.push(0 , 4);
        t.push(0 , 7);
        t.push(0 , 6);

        t.push(2 , 7);
        t.push(2 , 6);

        Assert.assertFalse(t.isEmpty(0));
        Assert.assertFalse(t.isEmpty(2));
        Assert.assertTrue(t.isEmpty(1));

        Assert.assertEquals(t.pop(0), 6);
        Assert.assertEquals(t.pop(2), 6);
        Assert.assertEquals(t.top(2) , 7);
        Assert.assertEquals(t.size(2) , 1);
        Assert.assertEquals(t.size(0) , 2);


    }
}