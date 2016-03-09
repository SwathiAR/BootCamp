package CrackingCodingInterview.Stacks;

import java.util.ArrayList;

/**
 * Created by root on 12/23/15.
 */
public class StackOfPlates {
    int stackSize;
    ArrayList<ArrayList<Integer>> stacks = new ArrayList<ArrayList<Integer>>();
    int stackIndex = 0;
    int top = 0;
    ArrayList<Integer> stack;
    StackOfPlates(int stackSize){
        this.stackSize = stackSize;
        stack = new ArrayList<Integer>(stackSize);
        stacks.add(stack);

    }


    public void push(int value){
        if(top ==stackSize){
            stack = new ArrayList<Integer>(stackSize);
            stacks.add(stack);
            stackIndex++;
            top = 0;
        }
        stack.add(value);
        top++;
    }

    public int pop(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }

        Integer pop =stacks.get(stackIndex).get(top - 1);

        if(top == 1 && stackIndex == 0){
            stack.remove(0);
            top = 0;
        }
        else if(top ==1 ){
            stack.remove(0);
            stacks.remove(stackIndex--);
            top = stackSize;
        }
        else{
            stack.remove(top-1);
            top--;
        }
        return  pop;
    }

    public int top(){
        if (isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        return stacks.get(stackIndex).get(top - 1);
    }

    private boolean isEmpty() {

        return stackIndex ==0 && top ==0;
    }

    public int popAt(int index){
        if(isEmpty()){
            throw new RuntimeException("Stack is empty");
        }
        int pop;
        if(stackIndex == index){
            pop = stacks.get(stackIndex).get(top-1);
            stack.remove(top-1);
            if(top==1){
                stacks.remove(stackIndex);
                top = stackSize;
            }
            else
            top = top-1;

        }
        else{
            int indexTop = stacks.get(index).size() - 1;
            pop = stacks.get(index).get(indexTop);
            stacks.get(index).remove(indexTop);
        }
     leftShift(index);
     return pop;
    }

    private void leftShift(int index) {
        if(index == stackIndex){
            return;
        }
        for(int i = 0 ; i< stackIndex-index ; i++){
            stacks.get(index).add(stacks.get(++index).get(0));
            for(int j = 0 ; j<stacks.get(index).size()-2 ; j++){
                stacks.get(index).set(j , stacks.get(index).get(j+1));
            }

        }



    }
}
