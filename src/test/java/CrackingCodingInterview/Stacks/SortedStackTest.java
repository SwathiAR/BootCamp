package CrackingCodingInterview.Stacks;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Stack;

import static org.testng.Assert.*;

/**
 * Created by root on 12/27/15.
 */
public class SortedStackTest {
    SortedStack s = new SortedStack();

    @Test
    public void testSortStack() throws Exception {
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(2);
        stack.push(7);
        stack.push(4);
        stack.push(3);
        stack.push(9);
        stack.push(5);
        stack.push(4);
        stack.push(8);

        Stack<Integer> integers = s.sortStack(stack);
        Assert.assertEquals(integers.pop().intValue() , 9);
        Assert.assertEquals(integers.pop().intValue() , 8);
        Assert.assertEquals(integers.pop().intValue() , 7);
        Assert.assertEquals(integers.pop().intValue() , 5);
        Assert.assertEquals(integers.pop().intValue() , 4);
        Assert.assertEquals(integers.pop().intValue() , 4);
        Assert.assertEquals(integers.pop().intValue() , 3);
        Assert.assertEquals(integers.pop().intValue() , 2);


    }
}