package Sorting;

/**
 * Created by swathi on 11/25/2015.
 */
public class RadixSort {

    public int[] radixSort(int[] array) {
        int index = 1;
        boolean digitsPresent = true;
        while (digitsPresent) {
            //bucketize
            digitsPresent = false;
            int[][] buckets = new int[10][array.length];
            int[] bucketIndexes= new int[10];
            for (int anArray : array) {
                digitsPresent = digitsPresent || anArray >= index;
                int digit = (anArray / index) % 10;
                buckets[digit][bucketIndexes[digit]++] = anArray;
            }
            // flatMap
            for (int i = 0,arrayIndex=0; i < 10; i++) {
                int[] bucket = buckets[i];
                for (int i1 = 0; i1 < bucketIndexes[i]; i1++) {
                    int aBucket = bucket[i1];
                    array[arrayIndex++] = aBucket;
                }
            }
            index=index*10;
        }

        return array;
    }


}
