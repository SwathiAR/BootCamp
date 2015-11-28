package StringProblems;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 11/23/2015.
 */
public class LetterECounterTest {

    LetterECounter l = new LetterECounter();

    @Test
    public void testCountLetterE() throws Exception {
        Assert.assertEquals(l.countLetterE("swathie") , 1);
        Assert.assertEquals(l.countLetterE("swathi") , 0);
        Assert.assertEquals(l.countLetterE("eee") , 3);
        Assert.assertEquals(l.countLetterE(" ") , 0);


    }
}