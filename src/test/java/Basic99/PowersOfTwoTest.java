package Basic99;

import org.testng.annotations.Test;
import org.testng.Assert;



/**
 * Created by root on 12/6/15.
 */
public class PowersOfTwoTest {
    PowersOfTwo p = new PowersOfTwo();

    @Test
    public void testCalculatePowersOfTwo() throws Exception {
        Assert.assertEquals(p.calculatePowersOfTwo(6).toString(), "[2, 4, 8, 16, 32, 64]");
      Assert.assertEquals(p.calculatePowersOfTwo(1).toString() , "[2]");
        Assert.assertNull(p.calculatePowersOfTwo(-1));
    }
}