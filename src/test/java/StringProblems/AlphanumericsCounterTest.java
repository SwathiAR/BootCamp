package StringProblems;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 11/23/2015.
 */
public class AlphanumericsCounterTest {
    AlphanumericsCounter a = new AlphanumericsCounter();

    @Test
    public void testCountAlphanumeric() throws Exception {
        Assert.assertEquals(a.countAlphanumeric(null) , 0);
        Assert.assertEquals(a.countAlphanumeric("I am Swathi") , 9);
        Assert.assertEquals(a.countAlphanumeric("I am ") , 3);
        Assert.assertEquals(a.countAlphanumeric("") , 0);
        Assert.assertEquals(a.countAlphanumeric("I stay in San Jose, California") , 24);


    }

    @Test
    public void testCountAlphanumeric1() throws Exception {
        Assert.assertEquals(a.countAlphanumeric1(null) , 0);
//        Assert.assertEquals(a.countAlphanumeric1("I am Swathi") , 9);
        Assert.assertEquals(a.countAlphanumeric1("I am ") , 3);
        Assert.assertEquals(a.countAlphanumeric1("") , 0);
        Assert.assertEquals(a.countAlphanumeric1("I stay in San Jose, California") , 24);


    }
}


