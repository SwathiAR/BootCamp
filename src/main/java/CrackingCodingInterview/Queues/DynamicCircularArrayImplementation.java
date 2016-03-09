package CrackingCodingInterview.Queues;

/**
 * Created by root on 12/25/15.
 */
public class DynamicCircularArrayImplementation {
    int[] queueRep;
    int rear=0, front=0,size=0;
    public static final int CAPACITY = 10;
    int capacity;

    DynamicCircularArrayImplementation(int capacity){
        this.capacity = capacity;
        queueRep = new int[capacity];
    }

    DynamicCircularArrayImplementation(){
        this(CAPACITY);
    }


    public  void enQueue(int data){
        if(isFull()){
            expand();
        }
        size++;
        queueRep[rear] = data;
        rear = (rear+1)%capacity;


    }

    private void expand() {
        int[] newQueue = new int[capacity<<1];
        for(int i = front ; i<capacity; i++){
            newQueue[i-front] = queueRep[i%capacity];
        }
        queueRep= newQueue;
        front = 0;
        rear = size;
        capacity = capacity*2;
    }

    public void shrink(){

        if(capacity == 4*size()){
            int[] newQueue = new int[capacity/2];
            System.arraycopy(queueRep , 0 , newQueue , 0 , size());
            queueRep = newQueue;
        }
    }

    public boolean isFull() {
        return size() ==capacity;

    }

    public int deQueue(){
        if(isEmpty()){
            throw new RuntimeException("Queue is empty");
        }
        size--;
        int data = queueRep[front];
        queueRep[front] = Integer.MIN_VALUE;
        front = (front+1)%capacity;
        return data;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public int size() {
        return size;
    }

    public String toString(){
        String s = "[ ";
        for(int i = front ; i<size() ; i++){
            s = s + queueRep[i%capacity] + "\t";

        }

    return s + " ]";

    }

}
