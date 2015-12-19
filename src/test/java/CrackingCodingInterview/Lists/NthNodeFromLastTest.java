package CrackingCodingInterview.Lists;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/18/15.
 */
public class NthNodeFromLastTest {

    NthNodeFromLast  n = new NthNodeFromLast();

    @Test
    public void testGetNthNode() throws Exception {
        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(4);
        node.next.next.next = new Node(5);
        node.next.next.next.next = new Node(6);

        Assert.assertEquals(n.getNthNode(node , 2).toString() , "5-->6-->null");
        Assert.assertEquals(n.getNthNode(node , 3).toString() , "4-->5-->6-->null");
        Assert.assertEquals(n.getNthNode(node , 4).toString() , "3-->4-->5-->6-->null");
    }

    @Test
    public void testGetNthNode2() throws Exception {
        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(4);
        node.next.next.next = new Node(5);
        node.next.next.next.next = new Node(6);

        Assert.assertEquals(n.getNthNode2(node , 2).toString() , "5-->6-->null");
        Assert.assertEquals(n.getNthNode2(node , 3).toString() , "4-->5-->6-->null");
        Assert.assertEquals(n.getNthNode2(node , 4).toString() , "3-->4-->5-->6-->null");
    }
}
