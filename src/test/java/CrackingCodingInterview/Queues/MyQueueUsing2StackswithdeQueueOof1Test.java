package CrackingCodingInterview.Queues;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/26/15.
 */
public class MyQueueUsing2StackswithdeQueueOof1Test {
    MyQueueUsing2StackswithdeQueueOof1 m = new MyQueueUsing2StackswithdeQueueOof1();

    @Test
    public void test() throws  Exception{
        m.enQueue(3);
        m.enQueue(2);
        m.enQueue(5);
        Assert.assertEquals(m.deQueue(), 3);





    }

}

