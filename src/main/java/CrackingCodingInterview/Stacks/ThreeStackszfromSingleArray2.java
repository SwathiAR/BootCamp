package CrackingCodingInterview.Stacks;


/**
 * Created by root on 12/22/15.
 */
public class ThreeStackszfromSingleArray2 {
    int stackSize;
    int indexToUse = 0;
    int[] stackPointers = {-1 , -1 , -1};
    StackNode[] buffer;

    ThreeStackszfromSingleArray2(int stackSize){
        this.stackSize = stackSize;
        buffer = new StackNode[stackSize*3];

    }

    public void push(int stackNum , int value){

         StackNode node = new StackNode(stackPointers[stackNum] , value);

        stackPointers[stackNum] = indexToUse;
        buffer[indexToUse++] = node;

    }

public int pop(int stackNum){

    if(stackPointers[stackNum]<0){
        return  -1;
    }

    int pop = buffer[stackPointers[stackNum]].value;
    int lastIndex = buffer[stackPointers[stackNum]].previous;
    buffer[stackPointers[stackNum]] = null;
    stackPointers[stackNum] = lastIndex;
    return pop;
}


    public int top(int stackNum){
        if (stackPointers[stackNum]<0){
            return  -1;
        }
        return buffer[stackPointers[stackNum]].value;

    }




}



