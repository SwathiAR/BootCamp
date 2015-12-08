package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/8/15.
 */
public class WordCounterTest {
  WordCounter w = new WordCounter();
    @Test
    public void testCountWords() throws Exception {
        Assert.assertEquals(w.countWords("My name is swathi") , 4);
        Assert.assertEquals(w.countWords(" ") , 0);
        Assert.assertEquals(w.countWords(null) , 0);
        Assert.assertEquals(w.countWords("My") , 1);
    }
}