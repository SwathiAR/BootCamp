package CrackingCodingInterview.Lists;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/17/15.
 */
public class NodeTest {

    Node node = new Node(2);


    @Test
    public void testNode() throws Exception{
        System.out.println(node.toString());
        Assert.assertEquals(node.getData() , 2);
        node.setData(3);
        System.out.println(node.toString());
        Assert.assertEquals(node.getData(), 3);

        System.out.println(node.toString());
        Assert.assertEquals(node.getNext(), null);

        node.setNext(5);
        System.out.println(node.toString());
        Assert.assertEquals(node.getNext().getData() , 5);

        node.appendToTail(8);
        System.out.println(node.toString());
        Assert.assertEquals(node.getNext().getNext().getData() , 8);



            node.deleteNode(node , 8);
            System.out.println(node.toString());
            Assert.assertEquals(node.getNext().getNext() , null);



        }

}