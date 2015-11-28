import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/24/2015.
 */
public class SpellUpTest {

    SpellUp s = new SpellUp();
    @Test
    public void testSpellUp() throws Exception {
        Assert.assertEquals(s.spellUp("swathi") , "s-w-a-t-h-i");
        Assert.assertEquals(s.spellUp("I am swathi") , "I-a-m-s-w-a-t-h-i");
        Assert.assertEquals(s.spellUp("swathi123") , "s-w-a-t-h-i-1-2-3");
        Assert.assertEquals(s.spellUp(null) , null);
        Assert.assertEquals(s.spellUp("swathi*&^%") , "s-w-a-t-h-i-*-&-^-%");

    }
}