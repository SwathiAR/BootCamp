package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by root on 12/7/15.
 *
 */
public class LastElementOfArrayTest {
    LastElementOfArray l = new LastElementOfArray();
    String[] california = new String[]{"San Jose" , "MountainView" , "Santa Clara"};

    @Test
    public void testGetLastElemntOfStringArray() throws Exception {
        Assert.assertEquals("Santa Clara" , l.getLastElemntOfStringArray(california));
        Assert.assertEquals(null , l.getLastElemntOfStringArray(new String[1]));
        Assert.assertEquals(" " , l.getLastElemntOfStringArray(new String[]{" "}));
    }
}