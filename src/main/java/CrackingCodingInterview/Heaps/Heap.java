package CrackingCodingInterview.Heaps;

/**
 * Created by root on 1/24/16.
 */
public class Heap {

    public int[] array;
    public int count;
    public int capacity;
    public int parent;
    public int leftChild;
    public int rightChild;


    public Heap( int capacity) {
        this.capacity = capacity;
        this.count = 0;
        array = new int[capacity];
    }



    public int getParent(int i) {
        if (i <= 0 || i >= this.count) {
            return -1;
        } else return (i - 1) / 2;
    }


    public int getleftChild(int i) {
        int left = (i * 2) + 1;
        if (i<0 ||left >= count) {
            return -1;
        }
        return left;


    }

    public int getRightChild(int i) {

        int right = (i * 2) + 2;
        if (i<0 || right >= this.count) {
            return -1;
        }
        return right;
    }


    public int getMaximum() {

        if (this.count == 0) {
            return -1;
        }
        return array[0];
    }

    public void percolateDown(int i) {
        if(i==-1){
            return;
        }

        int l, r, max;
        l = getleftChild(i);
        r = getRightChild(i);
        if (l != -1 && array[l] > array[i]) {
            max = l;
        } else {
            max = i;
        }

        if (r != -1 && array[max] < array[r]) {
            max = r;
        }

        if (max != i) {
            int temp = array[i];
            array[i] = array[max];
            array[max] = temp;
            percolateDown(max);

        }
    }


    public int deleteMax() {

        if (this.count == 0) {
            return -1;
        }
        int data = array[0];
        array[0] = array[this.count - 1];
        this.count--;
        percolateDown(0);
        return data;


    }

    public void insert(int data){
        if(this.capacity == this.count){
            resize();
        }
        this.count++;
        int i = this.count-1;
        array[i] = data;
        while(i > 0 && array[i] > array[(i-1)/2]) {
            int temp = array[(i - 1) / 2];
            array[(i - 1) / 2] = array[i];
            array[i] = temp;
            i = (i-1)/2;

        }

    }

    private void resize() {
        int[] newArray = new int[this.capacity*2];
        for(int i = 0 ; i<this.count ; i++){
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }


}
