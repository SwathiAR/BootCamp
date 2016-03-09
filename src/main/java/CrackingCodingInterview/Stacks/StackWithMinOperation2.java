package CrackingCodingInterview.Stacks;

import CrackingCodingInterview.Lists.Node;

/**
 * Created by root on 12/23/15.
 * There’s just one issue with the first approach : if we have a large stack, we waste a lot of space by keeping

 track of the min for every single element. Can we do better?

 We can (maybe) do a bit better than this by using an additional stack which keeps track of

 the mins.
 */
public class StackWithMinOperation2 {
    Node head;
    Node min;
    int length = 0;

    public void push(int value) {
        if ((head == null) || (min.getData() >= value)) {
            Node temp = min;
            min = new Node(value);
            min.setNext(temp);
        }
        Node node = new Node(value);
        node.setNext(head);
        head = node;
        length++;

    }

    public int pop(){
        if(length==0){
            throw  new RuntimeException("Stack is empty");
        }
        if(min.getData()==head.getData()){
            min = min.getNext();
        }

        int pop = head.getData();
        head = head.getNext();
        length--;
        return pop;
    }

    public int peek(){
        if(length==0){
            throw  new RuntimeException("Stack is empty");
        }
        return head.getData();
    }

    public int min(){
        return min.getData();
    }


}
