package CrackingCodingInterview.Lists;

/**
 * Created by root on 12/17/15.
 */
public class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(int data){
      Node nextToNext = this.next;
        this.next = new Node(data);
        next.next = nextToNext;

    }

    public Node appendToTail(int data){
        Node newNode = new Node(data);
        Node last = this;

        while(last.next!=null){
            last = last.next;
        }
        last.next = newNode;
        return newNode;

    }

    public void deleteNode(Node head , int d){
        if(head.getData() == d) {
            next = head.next;
            head = null;
            if (next != null) {
                head = next;
            }

        }

        else{
            Node currentNode = head;
            while(currentNode.getNext()!=null ){
                if( currentNode.getNext().getData() == d){
                    currentNode.next = currentNode.getNext().getNext();
                }
                else
                currentNode = currentNode.getNext();
            }

        }
    }

    public String toString(){
        return data + "-->" + next;
    }
}
