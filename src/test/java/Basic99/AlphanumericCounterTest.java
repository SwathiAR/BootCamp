package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/8/15.
 */
public class AlphanumericCounterTest {
     AlphanumericCounter a = new AlphanumericCounter();
    @Test
    public void testCountAlphanumericValues() throws Exception {
        Assert.assertEquals(a.countAlphanumericValues("My id is swathi.bhat01@gmail.com") , 26);
        Assert.assertEquals(a.countAlphanumericValues(" ") , 0);
        Assert.assertEquals(a.countAlphanumericValues(null) , 0);
    }
}