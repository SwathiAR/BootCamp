package CrackingCodingInterview.Lists;

import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.LinkedList;

/**
 * Created by root on 12/16/15.
 */
public class DuplicateRemoval {

    public LinkedList<Integer> removeDuplicates(LinkedList<Integer> list) {
        LinkedHashSet<Integer> set = new LinkedHashSet<Integer>(list);

        return new LinkedList<Integer>(set);
    }


    public Node removeDuplicates1(Node node) {
        Node head = node;
        Hashtable<Integer, Boolean> table = new Hashtable<Integer, Boolean>();
          table.put(node.getData() , true);
        while(node.next!= null){
            Node currentNode = node.next;
            if(table.containsKey(currentNode.getData())){
                node.next = currentNode.next;
                currentNode = null;
            }
            else{
                table.put(currentNode.getData() , true);
                node = node.next;
            }

        }
        return head;
}


    public Node removeDuplicates2(Node head){

        if(head == null){
            return head;
        }

        Node start = head;
        Node currentNode = head.next;
        Node previousNode = head;
        while(currentNode != null) {

            while (start != currentNode) {
                if (currentNode.getData() == start.getData()) {
                    previousNode.next = currentNode.next;
                    currentNode = previousNode.next;
                } else {
                    start = start.next;
                }
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
   return  head;
    }
}
