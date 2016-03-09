package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/8/15.
 */
public class LetterECounterTest {
    LetterECounter l = new LetterECounter();
    @Test
    public void testCountE() throws Exception {
        Assert.assertEquals(l.countE("My name is swathi") , 1);
        Assert.assertEquals(l.countE("") , 0);
        Assert.assertEquals(l.countE(null) , 0);
    }
}