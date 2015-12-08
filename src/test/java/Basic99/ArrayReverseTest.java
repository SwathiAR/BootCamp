package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/8/15.
 */
public class ArrayReverseTest {
    ArrayReverse a = new ArrayReverse();

    @Test
    public void testReverseArray() throws Exception {
        Assert.assertEquals(a.reverseArray(new String[]{"Swathi" , "Shruthi" , "Shwetha" , "Appa" , "Amma"}) , (new String[]{"Amma" , "Appa" , "Shwetha" , "Shruthi" , "Swathi"}));

    }

    @Test
    public void testRecursiveReverse() throws Exception {
        Assert.assertEquals(a.recursiveReverse(new String[]{"Swathi" , "Shruthi" , "Shwetha" , "Appa" , "Amma"}) , new String[]{"Amma" , "Appa" , "Shwetha" , "Shruthi" , "Swathi"});
    }
}