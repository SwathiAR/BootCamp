package Sorting;

/**
 * Created by swathi on 11/24/2015.
 */
public class MergeSort2 {

    public int[] mergeSort(int[] array) {
        int n = array.length;

        if(n<2){
            return array;
        }

        else {
            int mid = n / 2;
            int[] leftArr = new int[mid];
            int[] rightArr = new int[n-mid];

            for(int i=0 ; i<mid;i++){
                leftArr[i]= array[i];
            }

            for(int i = mid ; i < array.length;i++){
                rightArr[i] = array[i];
            }

           return merge ( mergeSort(leftArr) , mergeSort(rightArr));

        }


    }

    private int[] merge(int[] leftArray, int[] rightArray) {

        int leftArrayLength = leftArray.length;
        int rightArrayLength = rightArray.length;
        int[] tempArray = new int[leftArrayLength + rightArrayLength];

        int k = 0, j = 0, i = 0;

        while (i < leftArrayLength && j < rightArrayLength) {
            if (leftArray[i] <= rightArray[j]) {
                tempArray[k] = leftArray[i];
                i++;
            } else if (rightArray[j] < leftArray[i]) {
                tempArray[k] = rightArray[j];
                j++;
            }
            k++;
        }
        while (i < leftArrayLength) {
            tempArray[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightArrayLength) {
            tempArray[k] = rightArray[j];
            j++;
            k++;
        }
        return tempArray;
    }
}