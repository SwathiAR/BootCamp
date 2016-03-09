package CrackingCodingInterview.Queues;

import java.util.Stack;

/**
 * Created by root on 12/26/15.
 */
public class MyQueueUsingStacksByGayle {

    Stack<Integer> stack1;
    Stack<Integer> stack2;

    MyQueueUsingStacksByGayle(){
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void enQueue(int data){
        stack1.push(data);
    }

    public int deQueue(){
        if(stack2.isEmpty()) {
            shift();
        }
        return stack2.pop();
    }

    private void shift() {
            while (!stack1.isEmpty()){
                stack2.push(stack1.pop());

        }


    }


}
