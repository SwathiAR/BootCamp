package CrackingCodingInterview.Queues.AnimalShelter;

/**
 * Created by root on 12/17/15.
 */
public class Node<T extends  Animal> {
    T data;
    Node next;

    public Node(T data){
        this.data = data;
    }

    public T getData(){
        return data;
    }

    public void setData(T data){
        this.data = data;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(T data){
      this.next = new Node(data);

    }

    public Node appendToTail(T data){
        Node newNode = new Node(data);
        Node last = this;

        while(last.next!=null){
            last = last.next;
        }
        last.next = newNode;
        return newNode;

    }

    public void deleteNode(Node head , T d){
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
