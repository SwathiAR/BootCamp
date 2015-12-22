package CrackingCodingInterview.Stacks;

/**
 * Created by root on 12/20/15.
 */
public class DynamicArrayStack {

    protected int capacity ;
    public static final int MINCAPACITY = 100;
    public static final int CAPACITY = 10;
    int top = -1;
    int[] stackRep;


    DynamicArrayStack(int cap){
        this.capacity = cap;
        stackRep = new int[capacity];
    }

    DynamicArrayStack(){
        this(CAPACITY);
    }

    public void push(int data){

        if(size() == capacity){
            expand();

        }
        else{
            stackRep[++top] = data;
        }


    }

    public void expand() {
        capacity = capacity*2;

        int[] newStack = new int[capacity] ;
        System.arraycopy(stackRep , 0 , newStack ,  0 , size());
          stackRep = newStack;

    }

    public int size() {

        return top+1;
    }


    private void  shrink(){
        if(capacity >= top/3){
            int[] newStack = new int[top *2];
            System.arraycopy(stackRep , 0 , newStack , 0 , size());
        }

    }

    public int pop(){

        if(size() < 0){
           throw  new RuntimeException("Stack is empty");

        }
        else{
            int data = stackRep[top];
            stackRep[top--] = Integer.MIN_VALUE;
            return  data;
        }




    }

    public int top(){

        if(size() < 0){
            throw  new RuntimeException("Stack is empty");

        }
        else{
            return stackRep[top];
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
