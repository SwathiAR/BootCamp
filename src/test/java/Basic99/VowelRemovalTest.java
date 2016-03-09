package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/9/15.
 */
public class VowelRemovalTest {

    VowelRemoval v = new VowelRemoval();

    @Test
    public void testRemoveVowel() throws Exception {
        Assert.assertEquals(v.removeVowel("Swathi") , "Sw*th*");
        Assert.assertEquals(v.removeVowel("dsfgt") , "dsfgt");
        Assert.assertEquals(v.removeVowel("") , "");
        Assert.assertEquals(v.removeVowel(null) , null);
    }

    @Test
    public void testRemoveVowel1() throws Exception {
        Assert.assertEquals(v.removeVowel1("Swathi") , "Sw*th*");
        Assert.assertEquals(v.removeVowel1("dsfgt") , "dsfgt");
        Assert.assertEquals(v.removeVowel1("") , "");
        Assert.assertEquals(v.removeVowel1(null) , null);

    }

    @Test
    public void testRemoveVowel2() throws Exception {
        Assert.assertEquals(v.removeVowel2("Swathi") , "Sw*th*");
        Assert.assertEquals(v.removeVowel2("dsfgt") , "dsfgt");
        Assert.assertEquals(v.removeVowel2("") , "");
        Assert.assertEquals(v.removeVowel2(null) , null);

    }
}