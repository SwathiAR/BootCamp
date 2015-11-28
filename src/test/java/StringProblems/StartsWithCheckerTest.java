package StringProblems;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 11/23/2015.
 */
public class StartsWithCheckerTest {

    StartsWithChecker s = new StartsWithChecker();
    @Test
    public void testStartsWith() throws Exception {
        Assert.assertEquals((s.startsWith("swathi" , "sw")) , true);
        Assert.assertEquals((s.startsWith("swathi" , "swa")) , true);
        Assert.assertEquals((s.startsWith("swathi" , "swat")) , true);
        Assert.assertEquals((s.startsWith("swathi" , "swath")) , true);
        Assert.assertEquals((s.startsWith("swathi" , "swathi")) , true);
        Assert.assertEquals((s.startsWith(null , "sw")) , false);
        Assert.assertEquals((s.startsWith("" , "sw")) , false);
        Assert.assertEquals((s.startsWith(null , null)) , false);





    }
}