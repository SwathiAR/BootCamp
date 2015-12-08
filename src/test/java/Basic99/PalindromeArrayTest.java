package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/8/15.
 */
public class PalindromeArrayTest {
   PalindromeArray p = new PalindromeArray();
    @Test
    public void testIsPalindrome() throws Exception {

        Assert.assertEquals(true , p.isPalindrome(new String[]{"Swathi" , "Shruthi" , "Shwetha" , "Shruthi" , "Swathi"}));
        Assert.assertEquals(false , p.isPalindrome(new String[]{}));
        Assert.assertEquals(false , p.isPalindrome(new String[]{"Swathi" , "Shruthi" , "Shwetha"}));

    }
}