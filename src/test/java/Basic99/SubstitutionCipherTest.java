package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

/**
 * Created by root on 12/9/15.
 */
public class SubstitutionCipherTest {
    SubstitutionCipher s = new SubstitutionCipher();
    @Test
    public void testSubstitution(){
       assertArrayEquals(new int[]{1,2, 3, 4}, s.encode("abcd") );
        Assert.assertEquals(s.encode("") , new int[]{});
        Assert.assertEquals(s.encode(null) , new int[]{});
        assertArrayEquals(s.encode("Hello World") , new int[]{8, 5, 12, 12, 15, -32, 23, 15, 18, 12, 4});
    }

}