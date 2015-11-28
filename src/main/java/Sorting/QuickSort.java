package Sorting;

/**
 * Created by swathi on 11/25/2015.
 */
public class QuickSort {

    public int[] doQuickSort(int[] array){
       return quickSort(array , 0 , array.length-1);
    }

    public int[] quickSort(int[] array , int start , int end){


        if(end-start<2){
            if(array[start] > array[end]){
                int temp = array[start];
                array[start] = array[end];
                array[end] = temp;
            }
            return  array;
        }

        else
        {
            int pivot = partition(array , 0 , end);


            if(pivot == end) {
               return quickSort(array, 0, pivot - 1);
            }
            else if(pivot == 0)
            return quickSort(array , pivot+1 , end);

            else
            {
                quickSort(array, 0, pivot - 1);
                quickSort(array, pivot + 1, end);
            }
        }
     return array;
    }

    private int partition(int[] array, int start, int end) {
        int pivot = array[end];
        int pivotLeftIndex = start;
        int pivotRightIndex = end-1;

       while( pivotLeftIndex<pivotRightIndex ){
        if(array[pivotLeftIndex] < pivot ){
            ++pivotLeftIndex;

        }
        if(array[pivotRightIndex] > pivot){
               --pivotRightIndex;
           }

           if(array[pivotLeftIndex]>pivot && array[pivotRightIndex] < pivot){
               int temp = array[pivotLeftIndex];
               array[pivotLeftIndex] = array[pivotRightIndex];
               array[pivotRightIndex] = temp;

           }



        }

        if(array[pivotRightIndex] > pivot){
            array[end] = array[pivotRightIndex];
            array[pivotRightIndex] = pivot;
            return pivotRightIndex;
        }

        else{
            array[end] = array[pivotRightIndex +1];
            array[pivotRightIndex+1] = pivot;
            return ++pivotRightIndex;

        }



    }
}
