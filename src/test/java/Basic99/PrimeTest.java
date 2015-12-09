package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/9/15.
 */
public class PrimeTest {
    Prime p = new Prime();
    @Test
    public void testPrime(){
        Assert.assertTrue(p.isPrime(7));
        Assert.assertFalse(p.isPrime(0));
        Assert.assertTrue(p.isPrime(19));
        Assert.assertFalse(p.isPrime(8));
    }

}