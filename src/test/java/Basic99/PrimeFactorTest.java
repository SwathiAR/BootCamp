package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

/**
 * Created by root on 12/9/15.
 */
public class PrimeFactorTest {
    PrimeFactor pf = new PrimeFactor();

    @Test
    public void testCalculatePrimeFactor() throws Exception {
        Assert.assertEquals(pf.calculatePrimeFactor(315).toString() , "[3, 3, 5, 7]" );
        Assert.assertEquals(pf.calculatePrimeFactor(98).toString() , "[2, 7, 7]" );
        Assert.assertEquals(pf.calculatePrimeFactor(105).toString() , "[3, 5, 7]" );

    }
}