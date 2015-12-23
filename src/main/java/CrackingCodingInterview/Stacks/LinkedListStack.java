package CrackingCodingInterview.Stacks;

import CrackingCodingInterview.Lists.Node;

/**
 * Created by root on 12/21/15.
 */
public class LinkedListStack {

    Node head;
    int length = 0;


    public void push(int data){
        Node node = new Node(data);
        length++;

        if(this.head == null){
            head = node;
        }
        else{
            node.setNext(head);
            head = node;
        }

    }

    public Node  pop(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        else {
            Node headNext = head.getNext();
            Node pop = head;
            head = headNext;
            length--;
            return pop;
        }

    }

    public int getLength(){
        return length;

    }

    public Node peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        else{

            return  head;

        }

    }

    public  boolean isEmpty() {

        return (length==0);
    }

    public String toString(){
        String s = "";

            Node temp = head;
            while(temp!=null){
               s = s + temp.getData() + "\n";
                temp = temp.getNext();
            }

        return s;
    }


}
