package CrackingCodingInterview.Lists;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;

import static org.testng.Assert.*;

/**
 * Created by root on 12/17/15.
 */
public class DuplicateRemovalTest {
   DuplicateRemoval d = new DuplicateRemoval();

    @Test
    public void testRemoveDuplicates() throws Exception {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(6);
        list.add(6);
        list.add(5);
        list.add(2);
        list.add(2);

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        list1.add(6);
        list1.add(5);
        list1.add(2);

        Assert.assertEquals(d.removeDuplicates(list) , list1);
    }

    @Test
    public void testRemoveDuplicates1() throws Exception {
        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(3);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(4);

        Node node1 = new Node(4);
        node1.next = new Node(4);
        node1.next.next = new Node(4);
        node1.next.next.next = new Node(4);
        node1.next.next.next.next = new Node(5);


        Assert.assertEquals(d.removeDuplicates1(node).toString(), "2-->3-->4-->null");
        Assert.assertEquals(d.removeDuplicates1(node1).toString() , "4-->5-->null" );
    }

    @Test
    public void testRemoveDuplicates2() throws Exception {
        Node node = new Node(2);
        node.next = new Node(3);
        node.next.next = new Node(3);
        node.next.next.next = new Node(3);
        node.next.next.next.next = new Node(4);

        Node node1 = new Node(4);
        node1.next = new Node(4);
        node1.next.next = new Node(4);
        node1.next.next.next = new Node(4);
        node1.next.next.next.next = new Node(5);


        Assert.assertEquals(d.removeDuplicates2(node).toString() , "2-->3-->4-->null" );
        Assert.assertEquals(d.removeDuplicates2(node1).toString() , "4-->5-->null" );
    }
}