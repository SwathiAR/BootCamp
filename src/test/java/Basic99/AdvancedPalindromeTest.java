package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/8/15.
 */
public class AdvancedPalindromeTest {
    AdvancedPalindrome a = new AdvancedPalindrome();
    @Test
    public void testIsPalindrome() throws Exception {
        Assert.assertFalse(a.isPalindrome("I never saw a purple cow"));
      Assert.assertTrue(a.isPalindrome("Rise to vote, Sir!"));
    }
}