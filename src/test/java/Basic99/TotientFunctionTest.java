package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/9/15.
 */
public class TotientFunctionTest {
    TotientFunction t = new TotientFunction();

    @Test
    public  void testTotientFunction(){
        Assert.assertEquals(t.phi(10) , 4);
    }

}