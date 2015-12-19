package CrackingCodingInterview.Lists;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/18/15.
 */
public class AddingistsTest {

    Addingists a = new Addingists();

    @Test
    public void testAddList() throws Exception {
     Node node1 = new Node(3);
        node1.appendToTail(1);
        node1.appendToTail(5);

        Node node2 = new Node(5);
        node2.appendToTail(9);
        node2.appendToTail(2);

        Node result = a.addList(node1, node2);

        Assert.assertEquals(result.toString(), "8-->0-->8-->null");


        Node aNode1 = new Node(9);
        aNode1.appendToTail(9);
        aNode1.appendToTail(9);

        Node aNode2 = new Node(3);
        aNode2.appendToTail(1);
        aNode2.appendToTail(5);

        Node result2 = a.addList(aNode1, aNode2);
        Assert.assertEquals(result2.toString() , "2-->1-->5-->1-->null");


        Node bNode1 = new Node(9);
        bNode1.appendToTail(9);

        Node bNode2 = new Node(9);


        Node result3 = a.addList(bNode1, bNode2);
        Assert.assertEquals(result3.toString() , "8-->0-->1-->null");
    }
}