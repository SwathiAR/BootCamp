import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by swathi on 11/23/2015.
 */
public class NthElementRemovalTest {
    NthElementRemoval n = new NthElementRemoval();

    @Test
    public void testRemoveNthElement() throws Exception {
        Assert.assertEquals(n.removeNthElement("swathi" , 0) , "wathi");
        Assert.assertEquals(n.removeNthElement("swathi" , 1) , "sathi");
        Assert.assertEquals(n.removeNthElement("swathi" , 2) , "swthi");
        Assert.assertEquals(n.removeNthElement("swathi" , 3) , "swahi");
        Assert.assertEquals(n.removeNthElement("swathi" , 4) , "swati");
        Assert.assertEquals(n.removeNthElement("swathi" , 5) , "swath");
        Assert.assertEquals(n.removeNthElement(null , 4) , null);
        Assert.assertEquals(n.removeNthElement("" , 5) , "");





    }

    @Test
    public void testRemoveNthElement1() throws Exception {

        Assert.assertEquals(n.removeNthElement1("swathi" , 0) , "wathi");
        Assert.assertEquals(n.removeNthElement1("swathi" , 1) , "sathi");
        Assert.assertEquals(n.removeNthElement1("swathi" , 2) , "swthi");
        Assert.assertEquals(n.removeNthElement1("swathi" , 3) , "swahi");
        Assert.assertEquals(n.removeNthElement1("swathi" , 4) , "swati");
        Assert.assertEquals(n.removeNthElement1("swathi" , 5) , "swath");
        Assert.assertEquals(n.removeNthElement1(null , 4) , null);
        Assert.assertEquals(n.removeNthElement1("" , 5) , "");

    }

}