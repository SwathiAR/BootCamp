package CrackingCodingInterview.Stacks;

import java.util.Stack;

/**
 * Created by root on 12/24/15.
 */
public class Tower {

    Stack<Integer> disks;
    int index ;

    public  Tower(int i){
        disks = new Stack<Integer>();
        index = i;
    }

    public void add(int num){
        if(!disks.isEmpty() && disks.peek()<= num){
            throw new RuntimeException("Error! Please place smaller disk");
        }
        disks.push(num);

    }

    public void moveTopTo(Tower t ){
        t.add(disks.pop());
    }

    public void moveDisks(int n , Tower buffer , Tower dest ) {
        if (n > 0) {
            moveDisks(n - 1, dest, buffer);
            moveTopTo(dest);
            buffer.moveDisks(n - 1, this, dest);

        }
    }

    public int size(){
        return disks.size();
    }




}
