package CrackingCodingInterview.Stacks;

import java.util.Stack;

/**
 * Created by root on 12/27/15.
 */
public class SortedStack {
    Stack<Integer> bufferStack = new Stack<Integer>();

    public Stack<Integer> sortStack(Stack<Integer> givenStack) {
        int length = givenStack.size();

        for (int i = 0; i < length; i++) {
            int max = Integer.MIN_VALUE;
            int duplicate=0;
            while (!givenStack.isEmpty()) {
                if(max==givenStack.peek()){
                   duplicate++;
                }
                if (max < givenStack.peek()) {
                    max = givenStack.peek();
                    duplicate=0;
                }
                bufferStack.push(givenStack.pop());

            }


            int p = -1;
            while (bufferStack.size() > i) {

                if (bufferStack.peek() == max) {
                    p = bufferStack.pop();
                } else {
                    givenStack.push(bufferStack.pop());
                }

            }
            if (p >= 0) {
                for (int j = 0; j <= duplicate; j++) {
                    bufferStack.push(p);
                }
                i=i+duplicate;
            }
        }
        while(!bufferStack.isEmpty()){
            givenStack.push(bufferStack.pop());
        }
        return givenStack;
    }
}
