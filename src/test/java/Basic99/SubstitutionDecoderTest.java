package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/9/15.
 */
public class SubstitutionDecoderTest {
    SubstitutionDecoder s = new SubstitutionDecoder();

    @Test
    public void testDecode() throws Exception {
        Assert.assertEquals(s.decode(new int[]{1,2, 3, 4}) , "ABCD");
        Assert.assertEquals(s.decode(new int[]{}) ,"");
        Assert.assertEquals(s.decode(null) , null);
        Assert.assertEquals(s.decode(new int[]{8, 5, 12, 12, 15, -32, 23, 15, 18, 12, 4}) , "HELLO WORLD");

    }
}