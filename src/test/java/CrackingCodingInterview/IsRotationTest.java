package CrackingCodingInterview;

import CrackingCodingInterview.Strings.IsRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by root on 12/16/15.
 */
public class IsRotationTest {
    IsRotation s = new IsRotation();

    @Test
    public void testIsSubstring() throws Exception {
        Assert.assertTrue(s.IsRotation("waterbottle", "terbottlewa"));
        Assert.assertFalse(s.IsRotation("water", "botthe"));
        Assert.assertFalse(s.IsRotation("water", "wat"));
        Assert.assertFalse(s.IsRotation("abcda", "bcdad"));
        Assert.assertFalse(s.IsRotation(null , "botthe"));
        Assert.assertTrue(s.IsRotation("", ""));



    }
}