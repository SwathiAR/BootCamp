package StringProblems;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 11/24/2015.
 */
public class SubstitutionTest {
    Substitution s = new Substitution();

    @Test
    public void testSubstitute() throws Exception {
        Assert.assertEquals(s.substitute("abc") , "123");

    }

}