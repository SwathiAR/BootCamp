package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/9/15.
 */
public class CoprimesTest {
     Coprimes c = new Coprimes();
    @Test
    public void testIsCoprime() throws Exception {
        Assert.assertTrue(c.isCoprime(35 , 64));
    }
}