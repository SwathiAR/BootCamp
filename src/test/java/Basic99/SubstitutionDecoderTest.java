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
        Assert.assertEquals(s.decode("85121215-32231518124") , "hello world");
        Assert.assertEquals(s.decode("1234") ,"abcd");
        Assert.assertEquals(s.decode("") , "");
        Assert.assertEquals(s.decode(null) , null);

    }
}