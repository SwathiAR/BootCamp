package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/8/15.
 */
public class EliminateConsecutiveDuplicatesTest {
EliminateConsecutiveDuplicates e = new EliminateConsecutiveDuplicates();
    @Test
    public void testEliminateConsecutiveDuplicates() throws Exception {
        Assert.assertEquals(e.eliminateConsecutiveDuplicates(new int[]{2,2,2,3,4,4,4,5,6,7,8,8,8}), new int[]{2,3,4,5,6,7,8});

    }
}