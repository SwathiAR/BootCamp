package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

/**
 * Created by root on 12/10/15.
 */
public class GoldBachPairTest {
    GoldBachPair g = new GoldBachPair();

    @Test
    public void testGetGoldBachPair() throws Exception {
        assertArrayEquals(g.getGoldBachPair(12), new int[]{11, 1});
        assertArrayEquals(g.getGoldBachPair(28), new int[]{23, 5});
        assertArrayEquals(g.getGoldBachPair(1856), new int[]{1853, 3});

    }
}