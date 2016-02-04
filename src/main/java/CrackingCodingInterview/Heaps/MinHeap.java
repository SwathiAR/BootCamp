package CrackingCodingInterview.Heaps;

import java.util.ArrayList;

/**
 * Created by root on 2/2/16.
 */
public class MinHeap<T extends Comparable> {
    public ArrayList<T> array;
    public int count;
    public int capacity;
    public int parent;
    public int leftChild;
    public int rightChild;


    public MinHeap( int capacity) {
        this.capacity = capacity;
        this.count = 0;
        array = new ArrayList<T>(capacity);
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


    public T getMinimum() {

        if (this.count == 0) {
            return null;
        }
        return array.get(0);
    }

    public void percolateDown(int i) {
        if(i==-1){
            return;
        }

        int l, r, min;
        l = getleftChild(i);
        r = getRightChild(i);
        if (l != -1 && (array.get(i).compareTo(array.get(l))) >0) {
            min = l;
        } else {
            min = i;
        }

        if (r != -1 && (array.get(min).compareTo(array.get(r)) > 0)) {
            min = r;
        }

        if (min != i) {
            T temp = array.get(i);
            array.set(i ,  array.get(min));
            array.set(min , temp);
            percolateDown(min);

        }
    }


    public T deleteMin() {

        if (this.count == 0) {
            return null;
        }
        T data = array.get(0);
        array.set(0 , array.get(this.count -1)) ;
        this.count--;
        percolateDown(0);
        return data;


    }

    public void insert(T data){

        this.count++;
        int i = (this.count-1);
        array.add(i , data);
        while(i > 0 && (array.get(i).compareTo(array.get((i-1)/2)) < 0)) {
            T temp = array.get((i - 1) / 2);
            array.set(((i - 1) / 2) , array.get(i));
            array.set(i , temp);
            i = (i-1)/2;

        }

    }



}
