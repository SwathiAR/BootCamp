package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/9/15.
 */
public class EuclidTest {
    Euclid e = new Euclid();

    @Test
    public void testGetGCD() throws Exception {
        Assert.assertEquals(e.getGCD(252 ,105) , 21);
        Assert.assertEquals(e.getGCD(1071 ,462) , 21);
        Assert.assertEquals(e.getGCD(6 ,35) , 1);
        Assert.assertEquals(e.getGCD(36 ,63) , 9);
    }
}