package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashSet;

import static org.testng.Assert.*;

/**
 * Created by root on 12/9/15.
 */
public class ListOfPrimeNumbersTest {

    ListOfPrimeNumbers lp =  new ListOfPrimeNumbers();

    @Test
    public void testGetPrimeNumbers() throws Exception {
        HashSet set = new HashSet();
        set.add(17);
        set.add(19);
        set.add(11);
        set.add(13);
        Assert.assertEquals(lp.getPrimeNumbers(10 , 20) , set);

    }
}