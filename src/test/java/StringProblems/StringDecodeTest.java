package StringProblems;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 11/23/2015.
 */
public class StringDecodeTest {

    StringDecode s = new StringDecode();

    @Test
    public void testGetString() throws Exception {


        Assert.assertEquals(s.getString("s2wa4thi2"), "sswaaaathii");
        Assert.assertEquals(s.getString("s2"), "ss");
        Assert.assertEquals(s.getString(""), "");
        Assert.assertEquals(s.getString(" 3"), "   ");

        Assert.assertEquals(s.getString("") , "");

        Assert.assertEquals(s.getString("wat3"), "wattt");
        Assert.assertEquals(s.getString("wat3"), "wattt");

    }

}