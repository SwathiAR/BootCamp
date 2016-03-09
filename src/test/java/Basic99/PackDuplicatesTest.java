package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/8/15.
 */
public class PackDuplicatesTest {
   PackDuplicates p = new PackDuplicates();
    @Test
    public void testPackDupliactes() throws Exception {

        Assert.assertEquals(p.packDupliactes(new char[]{'a' , 'a' , 'a' ,'b' ,'b' ,'b' , 'b' , 'c' , 'c' , 'd'}), new String[]{"aaa" , "bbbb" ,"cc" ,"d" });
        Assert.assertEquals(p.packDupliactes(new char[]{'a' , 'b' , 'a' ,'a' ,'b' ,'b' , 'b' }), new String[]{"a" , "b" ,"aa" ,"bbb" });
        Assert.assertEquals(p.packDupliactes(null), null);
        Assert.assertEquals(p.packDupliactes(new char[]{}), new String[]{});
    }
}