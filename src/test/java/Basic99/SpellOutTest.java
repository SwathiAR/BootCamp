package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/9/15.
 */
public class SpellOutTest {
    SpellOut s = new SpellOut();

    @Test
    public void testSpellOut() throws Exception {
        Assert.assertEquals(s.spellOut("I never saw a purple cow") , "I N-E-V-E-R S-A-W A P-U-R-P-L-E C-O-W");
        Assert.assertEquals(s.spellOut("My Name is Swathi A R") , "M-Y N-A-M-E I-S S-W-A-T-H-I A R");
        Assert.assertEquals(s.spellOut("a b C") , "A B C");
        Assert.assertEquals(s.spellOut("ABC") , "A-B-C");
    }
}