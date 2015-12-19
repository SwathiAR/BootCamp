package CrackingCodingInterview.Lists;

/**
 * Created by root on 12/18/15.
 */
public class NthNodeFromLast {

    public Node getNthNode(Node head ,int pos){
        if(head==null){
            return head;
        }
        Node node = head;
        int length = 1;
        while(node.next != null){
            node = node.next;
            length++;
        }

        int requiredPosition = length-pos+1;

        int count = 1;
        while(count < requiredPosition){
            head = head.next;
            count++;

        }




return  head;


    }


    public Node getNthNode2(Node head , int pos){
        Node firstNode = head;
        Node secondNode = head;
        int count = 1;
        while(count <pos){
            secondNode = secondNode.next;
            count++;
        }

        while(secondNode.next!=null){
            secondNode = secondNode.next;
            firstNode = firstNode.next;
        }

        return firstNode;
    }


}
