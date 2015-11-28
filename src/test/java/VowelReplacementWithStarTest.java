import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/24/2015.
 */
public class VowelReplacementWithStarTest {
    VowelReplacementWithStar v = new VowelReplacementWithStar();

    @Test
    public void testReplaceVowels() throws Exception {
        Assert.assertEquals(v.replaceVowels("swathi") , "sw*th*");
        Assert.assertEquals(v.replaceVowels("chethan") , "ch*th*n");
        Assert.assertEquals(v.replaceVowels("swsss") , "swsss");
        Assert.assertEquals(v.replaceVowels("aaiiuuo") , "*******");
        Assert.assertEquals(v.replaceVowels("") , "");
        Assert.assertEquals(v.replaceVowels(null ) , null);

    }

    @Test
    public void testReplaceVowels1() throws Exception {
        Assert.assertEquals(v.replaceVowels("swathi") , "sw*th*");
        Assert.assertEquals(v.replaceVowels("chethan") , "ch*th*n");
        Assert.assertEquals(v.replaceVowels("swsss") , "swsss");
        Assert.assertEquals(v.replaceVowels("aaiiuuo") , "*******");
        Assert.assertEquals(v.replaceVowels("") , "");
        Assert.assertEquals(v.replaceVowels(null) , null);

    }
}