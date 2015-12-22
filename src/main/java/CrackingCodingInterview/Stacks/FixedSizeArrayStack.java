package CrackingCodingInterview.Stacks;

/**
 * Created by root on 12/20/15.
 */
public class FixedSizeArrayStack {

    protected int capacity;
    public static final int CAPACITY = 10;
    protected int[] stackRep ;

    FixedSizeArrayStack(int cap){
        this.capacity = cap;
        stackRep = new int[capacity];
    }

    FixedSizeArrayStack(){
        this(CAPACITY);
    }

    int top = -1;

    public void push(int data){

        if(size() > capacity){
            throw new RuntimeException("Stack is full");
        }
        else
        {
            stackRep[++top] = data;
        }

    }

    public int size() {
        return (top+1);

    }

    public int pop(){
        if(isEmpty()){
            throw  new RuntimeException("Stack is empty");
        }
        else{
            int data = stackRep[top];
            stackRep[top] = Integer.MIN_VALUE;
            top--;
            return data;

        }
    }

    private boolean isEmpty() {
        return top<0;
    }

    public  int top(){
        if(isEmpty()){
            throw  new RuntimeException("Stack is empty");
        }
        else{
            return  stackRep[top];

        }

    }

    public String toString(){
        String s = "[";
        if(top>0){
            s = s + stackRep[0];
        }
        if (top>1){
            for(int i = 1 ; i<size() ; i++){
                s = s + ", " + stackRep[i];
            }
        }
        return s +  "]";
    }

}
