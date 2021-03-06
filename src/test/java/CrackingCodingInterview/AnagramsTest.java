package CrackingCodingInterview;

import CrackingCodingInterview.Strings.Anagrams;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by root on 12/15/15.
 */
public class AnagramsTest {
    Anagrams a = new Anagrams();

    @Test
    public void testIsAnagram() throws Exception {
      Assert.assertTrue(a.isAnagram("tea", "ate"));
        Assert.assertFalse(a.isAnagram("tea", "atm"));
        Assert.assertFalse(a.isAnagram("tea", null));
        Assert.assertFalse(a.isAnagram("tea", "kate"));
    }

    @Test
    public void testIsAnagram1() throws Exception {
        Assert.assertTrue(a.isAnagram1("tea" , "ate"));
        Assert.assertFalse(a.isAnagram1("tea", "atm"));
        Assert.assertFalse(a.isAnagram1("tea", null));
        Assert.assertFalse(a.isAnagram1("tea", "kate"));
    }

    @Test
    public void testIsAnagram2() throws Exception {

            Assert.assertTrue(a.isAnagram2("tea", "ate"));
            Assert.assertFalse(a.isAnagram2("tea", "atm"));
            Assert.assertFalse(a.isAnagram2("tea", null));
            Assert.assertFalse(a.isAnagram2("tea", "kate"));

    }
}