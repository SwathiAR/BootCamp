package CrackingCodingInterview;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/14/15.
 */
public class StringUniqueDetectorTest {
    StringUniqueDetector s = new StringUniqueDetector();

    @Test
    public void testIsUnique() throws Exception {

            Assert.assertTrue(s.isUnique("swathi"));
            Assert.assertFalse(s.isUnique(""));
            Assert.assertTrue(s.isUnique("swa"));
            Assert.assertFalse(s.isUnique(null));
            Assert.assertFalse(s.isUnique("sarala"));

        Assert.assertTrue(s.isUniqueString("swathi"));
        Assert.assertFalse (s.isUniqueString(""));
        Assert.assertTrue(s.isUniqueString("swa"));
        Assert.assertFalse (s.isUniqueString(null));
        Assert.assertFalse (s.isUniqueString("sarala"));
        }


}