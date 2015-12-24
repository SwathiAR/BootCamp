package CrackingCodingInterview.Stacks;

import CrackingCodingInterview.Lists.Node;

/**
 * Created by root on 12/23/15.
 */
public class StackNodeWithMin {

    public StackNodeWithMin getPrevious() {
        return previous;
    }

    public void setPrevious(StackNodeWithMin previous) {
        this.previous = previous;
    }

    private StackNodeWithMin previous;
    private int data;
    private int min;

    public int getData() {
        return data;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }


    StackNodeWithMin(int data){
        this.data = data;
    }

}
