package CrackingCodingInterview.Queues;

import CrackingCodingInterview.Lists.Node;

/**
 * Created by root on 12/25/15.
 */
public class LinkedListImplementation {

    Node front;
    Node rear;
    int size = 0;


    public void enQueue(int data) {
        Node node = new Node(data);
        if(isEmpty()){
            front = node;
            rear = front;
        }
        else {
            rear.setNext(node);
            rear = node;
        }
        size++;


    }

    public int deQueue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        size--;
        int data = front.getData();
        front = front.getNext();
        if(isEmpty()){
            rear =null;
        }
        return data;

    }
    public int first(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        return front.getData();

    }

    public boolean isEmpty() {
        return size == 0;

    }
    public int size(){
        return size;
    }

    public  String toString(){
        String s = "";
        Node node = front;
        while(node != null){
            s = s+ " " +  node.getData();
            node = node.getNext();
        }


        return s;

    }

}
