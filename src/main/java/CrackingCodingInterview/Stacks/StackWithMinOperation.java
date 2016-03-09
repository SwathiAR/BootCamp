package CrackingCodingInterview.Stacks;

import CrackingCodingInterview.Lists.Node;

/**
 * Created by root on 12/23/15.
 */
public class StackWithMinOperation {

    StackNodeWithMin head;
    int length=0;

    public void push(int value){
        StackNodeWithMin node = new StackNodeWithMin(value);
        node.setPrevious(head);
        int min = head==null?value:head.getMin()>value?value:head.getMin();
        node.setMin(min);
        head = node;
        length++;
    }

    public int pop(){

        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int pop = head.getData();
        head = head.getPrevious();
        length--;
        return pop;

    }

    public int peek(){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return head.getData();
    }

    private boolean isEmpty() {
        return length==0;

    }

    public int min(){
        return head.getMin();

    }




}
