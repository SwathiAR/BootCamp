package CrackingCodingInterview;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/14/15.
 */
public class ReverseCStyleStringTest {

    ReverseCStyleString s = new ReverseCStyleString();

    @Test
    public void testReverse() throws Exception {
        Assert.assertEquals(s.reverse("malayalam ") , "malayalam ");
        Assert.assertEquals(s.reverse("swathi ") , "ihtaws ");
        Assert.assertEquals(s.reverse("m ") , "m ");
        Assert.assertEquals(s.reverse("") , "");
        Assert.assertEquals(s.reverse(" ") , " ");
    }
}