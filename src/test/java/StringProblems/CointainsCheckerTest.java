package StringProblems;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 11/23/2015.
 */
public class CointainsCheckerTest {
    CointainsChecker c = new CointainsChecker();

    @Test
    public void testContains() throws Exception {
        Assert.assertEquals(c.contains("chethan" , "he"), true);
        Assert.assertEquals(c.contains("chethan" , "che"), true);
        Assert.assertEquals(c.contains("chethan" , "han"), true);
        Assert.assertEquals(c.contains("chethan" , ""), false);
        Assert.assertEquals(c.contains(null , "h" ), false);

    }
}