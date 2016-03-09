package CrackingCodingInterview.Heaps;

/**
 * Created by root on 1/25/16.
 */
public class HeapBuilder {

    public Heap buildHeap(int[] array){
        int length = array.length;
        Heap h = new Heap(length);
        for(int i = 0 ; i<length;i++){
            h.array[i] = array[i];
        }
        h.count = length;
        for(int i = (h.count-1)/2 ; i>=0 ; i-- ){
            h.percolateDown(i);
        }
        return h;
    }
}
