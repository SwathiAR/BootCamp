import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/23/2015.
 */
public class EndsWithCheckerTest {
    EndsWithChecker e = new EndsWithChecker();

    @Test
    public void testEndsWith() throws Exception {

        Assert.assertEquals((e.endsWith("swathi", "hi")), true);
        Assert.assertEquals((e.endsWith("swathi" , "thi")) , true);
        Assert.assertEquals((e.endsWith("swathi" , "athi")) , true);
        Assert.assertEquals((e.endsWith("swathi" , "wathi")) , true);
        Assert.assertEquals((e.endsWith("swathi" , "swathi")) , true);
        Assert.assertEquals((e.endsWith(null , "sw")) , false);
        Assert.assertEquals((e.endsWith("" , "sw")) , false);
        Assert.assertEquals((e.endsWith(null , null)) , false);



    }
}