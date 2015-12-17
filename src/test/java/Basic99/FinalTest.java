package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/15/15.
 */
public class FinalTest {
    Final f = new Final();

    @Test
    public void testGetArray() throws Exception {
        Assert.assertEquals(f.getArray(new int[]{2,5,5}) , new int[]{2,5,6});
    }
}