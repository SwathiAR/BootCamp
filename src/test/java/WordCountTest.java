import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/23/2015.
 */
public class WordCountTest {

    WordCount w = new WordCount();

    @Test
    public void testCountWords() throws Exception {

        Assert.assertEquals(w.countWordsUsingSplit("I am Swathi") , 3);
        Assert.assertEquals(w.countWordsUsingSplit("    ") , 0);
        Assert.assertEquals(w.countWordsUsingSplit(null) , 0);
        Assert.assertEquals(w.countWordsUsingSplit("I") , 1);
        Assert.assertEquals(w.countWordsUsingSplit("I am") , 2);
        Assert.assertEquals(w.countWordsUsingSplit("My name is Swathi") , 4);
    }

    @Test
    public void testCountWords1() throws Exception {
        Assert.assertEquals(w.countWordsWithoutSplit("I am Swathi") , 3);
        Assert.assertEquals(w.countWordsWithoutSplit("    ") , 0);
        Assert.assertEquals(w.countWordsWithoutSplit(null) , 0);
        Assert.assertEquals(w.countWordsWithoutSplit("I") , 1);
        Assert.assertEquals(w.countWordsWithoutSplit("I am") , 2);
        Assert.assertEquals(w.countWordsWithoutSplit("My name is Swathi") , 4);

    }
}