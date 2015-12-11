package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/11/15.
 */
public class TimeToWordsTest {
     TimeToWords t = new TimeToWords();
    @Test
    public void testGetTimeInWords() throws Exception {
        Assert.assertEquals(t.getTimeInWords("12:00") , "Twelve O'Clock");
        Assert.assertEquals(t.getTimeInWords("2:05") , "Five past Two");
        Assert.assertEquals(t.getTimeInWords("2:47") , "Thirteen to Two");
        Assert.assertEquals(t.getTimeInWords("02:00") , "Two O'Clock");
        Assert.assertEquals(t.getTimeInWords("12:30") , "Half past Twelve");
        Assert.assertEquals(t.getTimeInWords("4:29") , "Twenty Nine past Four");
        Assert.assertEquals(t.getTimeInWords("12:45") , "Quarter to Twelve");
        Assert.assertEquals(t.getTimeInWords("12:55") , "Five to Twelve");
    }
}