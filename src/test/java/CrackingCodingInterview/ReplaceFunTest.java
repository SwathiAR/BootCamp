package CrackingCodingInterview;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/15/15.
 */
public class ReplaceFunTest {

    ReplaceFun rf = new ReplaceFun();

    @Test
    public void testReplace() throws Exception {

        Assert.assertEquals(rf.replace("My name is swathi") , "My%20name%20is%20swathi");
        Assert.assertEquals(rf.replace(null) , null);
        Assert.assertEquals(rf.replace("swathi") , "swathi");
        Assert.assertEquals(rf.replace(" swathi ") , "%20swathi%20");
        Assert.assertEquals(rf.replace("") , "");
        Assert.assertEquals(rf.replace(" ") , "%20");

    }
}