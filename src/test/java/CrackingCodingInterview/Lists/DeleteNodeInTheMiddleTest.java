package CrackingCodingInterview.Lists;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/18/15.
 */
public class DeleteNodeInTheMiddleTest {
DeleteNodeInTheMiddle d = new DeleteNodeInTheMiddle();

    @Test
    public void testDeleteTheMiddleNode() throws Exception {
     Node node = new Node(2);
        Node node1 = node.appendToTail(3);
        Node node2 = node.appendToTail(4);
        Node node3 = node.appendToTail(5);
        Node node4 = node.appendToTail(6);


       d.deleteTheMiddleNode(node3);
        Assert.assertEquals(node.toString(), "2-->3-->4-->6-->null");

    }
}