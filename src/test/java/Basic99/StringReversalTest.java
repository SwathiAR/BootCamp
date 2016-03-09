package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/8/15.
 */
public class StringReversalTest {

    StringReversal s = new StringReversal();

    @Test
    public void testReverseString() throws Exception {
        Assert.assertNull(s.reverseString(null));
        Assert.assertNull(s.reverseRecursively(null));
        Assert.assertEquals(s.reverseString(" "), " ");
       Assert.assertEquals(s.reverseRecursively(" "), " ");
        Assert.assertEquals(s.reverseString("swathi"), "ihtaws");
        Assert.assertEquals(s.reverseRecursively("swathi"), "ihtaws");

    }

}