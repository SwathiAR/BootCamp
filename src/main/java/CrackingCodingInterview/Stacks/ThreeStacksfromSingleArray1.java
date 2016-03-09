package CrackingCodingInterview.Stacks;

/**
 * Created by root on 12/22/15.
 * Describe how you could use a single array to implement three stacks.
 */
public class ThreeStacksfromSingleArray1 {
    int stackSize = 300;
    int[] array = new int[stackSize *3];
    int[] stackPointer = {0 , 0 , 0};

    public void push(int stackNum , int value){
        int index = stackNum*stackSize + stackPointer[stackNum]++;
        if(index < (stackNum+1)*300) {
            array[index] = value;
        }
    }

    public int pop(int stackNum){
        int index = stackNum*stackSize + stackPointer[stackNum]-1;
        stackPointer[stackNum]--;
        int i = array[index];
        array[index] = 0;
        return  i ;

    }

    public int top(int stackNum){
        return  array[stackNum*stackSize + stackPointer[stackNum]-1];
    }

    public boolean isEmpty(int stackNum){
        return stackPointer[stackNum] <=0;
    }

    public int size(int stackNum){
       return stackPointer[stackNum];
    }

}
