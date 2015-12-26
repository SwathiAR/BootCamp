package CrackingCodingInterview.Queues;

/**
 * Created by root on 12/25/15.
 */
public class SimpleCircularArrayImplementation {
    int[] queueRep ;
    int rear=0 , front=0 , size=0;
    public static final int CAPACITY = 10;
    int capacity;

    SimpleCircularArrayImplementation(int capacity){
        this.capacity = capacity;
        queueRep = new int[capacity];

    }

    SimpleCircularArrayImplementation(){
        this(CAPACITY);
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size==0;
    }

    public boolean isFull(){
        return size==capacity;
    }

    public void enQueue(int data){
        if(isFull()){
            throw new RuntimeException("Queue is full");
        }

        size++;
        queueRep[rear] = data;
        rear = (rear+1)%capacity;

    }

    public int deQueue(){
        if(isEmpty()){
            throw  new RuntimeException("Queue is empty");
        }

        size--;
        int data = queueRep[front];
        queueRep[front] = Integer.MIN_VALUE;
        front = (front+1) %capacity;
    return  data;
    }

    public String toString(){
        String result = "[";
        for(int i = 0 ; i<size() ; i++){
        result = result+ " , "+ queueRep[(front+i)%capacity];
        }

        return result + " ]";

    }

}
