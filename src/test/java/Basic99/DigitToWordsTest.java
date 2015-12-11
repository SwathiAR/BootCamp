package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/10/15.
 */
public class DigitToWordsTest {
    DigitToWords d = new DigitToWords();

    @Test
    public void testGetWords() throws Exception {
        Assert.assertEquals(d.getWords("1234") , new String[]{"One" , "Two" , "Three" , "Four"});

    }
}