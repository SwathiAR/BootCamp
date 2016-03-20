package CrackingCodingInterview.DynamicProgramming;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 3/13/16.
 */
public class FibonacciTest {

    @Test
    public void testGetFibonacci() throws Exception {
    Fibonacci f = new Fibonacci();
        Assert.assertEquals(f.getFibonacci(2) , 2);
        Assert.assertEquals(f.getFibonacci(3), 3);
        Assert.assertEquals(f.getFibonacci(4) , 5);

    }
}