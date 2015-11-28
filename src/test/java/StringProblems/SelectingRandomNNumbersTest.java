package StringProblems;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by swathi on 11/23/2015.
 */
public class SelectingRandomNNumbersTest {
    SelectingRandomNNumbers s = new SelectingRandomNNumbers();

    @Test
    public void testSelectNRandomNumbers() throws Exception {
        Assert.assertEquals((s.selectNRandomNumbers("swathi" , 2 )).length() , 2);
        Assert.assertEquals((s.selectNRandomNumbers("swathi" , 3 )).length() , 3);
        Assert.assertEquals((s.selectNRandomNumbers("swathi" , 1 )).length() , 1);
        Assert.assertEquals((s.selectNRandomNumbers("swathi" , 0)).length() , 0);



    }
}