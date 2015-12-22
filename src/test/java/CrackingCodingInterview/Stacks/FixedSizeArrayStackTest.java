package CrackingCodingInterview.Stacks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/20/15.
 */
public class FixedSizeArrayStackTest {
    FixedSizeArrayStack f = new FixedSizeArrayStack();

    @Test
    public void testStack() throws Exception {
     f.push(3);
        f.push(4);
        f.push(6);
        f.push(8);
        f.push(9);

        int size = f.size();
        Assert.assertEquals(size, 5);

        int pop = f.pop();
        Assert.assertEquals(pop , 9 );

        Assert.assertEquals(f.top() , 8);

        Assert.assertEquals(f.toString() , "[3, 4, 6, 8]");

    }


}