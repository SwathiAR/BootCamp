package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/8/15.
 */
public class StringPalindromeTest {
   StringPalindrome s = new StringPalindrome();
    @Test
    public void testIsPalindrome() throws Exception {
        Assert.assertFalse(s.isPalindrome("swathi"));
        Assert.assertTrue(s.isPalindrome("malayalam"));
        Assert.assertFalse(s.isPalindrome(""));
        Assert.assertFalse( s.isPalindrome(null));
    }
}