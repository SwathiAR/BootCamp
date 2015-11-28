package Sorting;

/**
 * Created by swathi on 11/25/2015.
 */
public class InsertionSort {

    public int[] insertionSort(int[] array) {
        for (int i = 0; i < array.length-1; i++) {
           for(int j = i+1 ; j>0 ;j--){

               if(array[j]<array[j-1]){
                   int temp = array[j-1];
                   array[j-1] = array[j];
                   array[j] = temp;
               }

            }
        }
        return array;
    }

}
