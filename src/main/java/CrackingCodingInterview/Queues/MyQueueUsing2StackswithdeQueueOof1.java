package CrackingCodingInterview.Queues;

import java.util.Stack;


/**
 * Created by root on 12/26/15.
 */
public class MyQueueUsing2StackswithdeQueueOof1 {


    Stack<Integer> stack1;
    Stack<Integer> stack2;


    MyQueueUsing2StackswithdeQueueOof1(){
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }

    public void enQueue(int data){

        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }
        stack2.push(data);

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }


    }


    public int deQueue(){
        return stack1.pop();
    }






}
