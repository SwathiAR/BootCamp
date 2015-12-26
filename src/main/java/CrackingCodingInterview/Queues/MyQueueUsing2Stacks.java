package CrackingCodingInterview.Queues;

import java.util.Stack;

/**
 * Created by root on 12/26/15.
 * enQueue O(1)
 */
public class MyQueueUsing2Stacks {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    MyQueueUsing2Stacks(){
        stack1 = new Stack<Integer>();
        stack2 = new Stack<Integer>();
    }


    public void enQueue(int data){
        stack1.push(data);
    }

    public int deQueue(){
        if(stack1.isEmpty()){
            return -1;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }

        int data = stack2.pop();

        while (!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
        return data;
    }







}
