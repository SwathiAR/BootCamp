package CrackingCodingInterview.Queues;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/25/15.
 */
public class LinkedListImplementationTest {
    LinkedListImplementation s = new LinkedListImplementation();

    @Test
    public void test(){

        s.enQueue(7);
        Assert.assertEquals(s.size(), 1);
        Assert.assertEquals(s.toString(), " 7");

        s.enQueue(8);
        s.enQueue(9);
        s.enQueue(6);
        s.enQueue(3);
        s.enQueue(9);
        Assert.assertEquals(s.size() , 6);

        Assert.assertEquals(s.deQueue(), 7);
        Assert.assertEquals(s.deQueue() , 8);
        Assert.assertEquals(s.deQueue() , 9);
        Assert.assertEquals(s.deQueue() , 6);
        Assert.assertEquals(s.deQueue() , 3);
        Assert.assertEquals(s.deQueue() , 9);
        Assert.assertEquals(s.size() , 0);

    }

}