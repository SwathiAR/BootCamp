package CrackingCodingInterview.Stacks;

import java.util.ArrayList;

/**
 * Created by root on 12/22/15.
 */
public class ThreeStacksFromSingleArray3 {



    int stackSize;
    int[] stackPointers = {-1 , -1 , -1};
    StackNode[] buffer;
    ArrayList<Integer> freeList;
    int index = 0;



    ThreeStacksFromSingleArray3(int stackSize){
        this.stackSize = stackSize;
        buffer = new StackNode[stackSize*3];
        freeList = new ArrayList<Integer>(stackSize*3);
        initialList();
    }

    public void initialList(){
        for(int i = 0 ; i<buffer.length ;i++){
            freeList.add(i);
        }

    }

    public void push(int stackNum , int value){
        buffer[freeList.get(index) ] = new StackNode(stackPointers[stackNum] , value);
        stackPointers[stackNum] = freeList.get(index);
        freeList.remove(index );

    }

    public int pop(int stackNum){
        int freeIndex = stackPointers[stackNum];
        int pop = buffer[stackPointers[stackNum]].value;
        int previous = buffer[stackPointers[stackNum]].previous;
        stackPointers[stackNum] = previous;
        freeList.add(freeIndex);


     return pop;
    }

    public  int top(int stackNum){
        if (stackPointers[stackNum]<0){
            return  -1;
        }
        return buffer[stackPointers[stackNum]].value;
    }





}
