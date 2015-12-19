package CrackingCodingInterview.Lists;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/19/15.
 */
public class FindingStartOfLoopTest {
FindingStartOfLoop f = new FindingStartOfLoop();
    @Test
    public void testFindTheStartOfLoop() throws Exception {

        Node node1 = new Node(2);
        node1.appendToTail(3);
        Node node2 = node1.appendToTail(4);
        node1.appendToTail(5);
        node1.appendToTail(6);
        Node node = node1.appendToTail(7);
        node.next = node2;


        Assert.assertEquals(f.findTheStartOfLoop(node1).getData() , 4 );
    }
}