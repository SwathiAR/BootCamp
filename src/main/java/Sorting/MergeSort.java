package Sorting;

/**
 * Created by swathi on 11/24/2015.
 */
public class MergeSort {

    public int[] mergeSort(int[] array) {

        int n = array.length;
        if (n < 2) {
            return array;
        } else {
            int mid = n / 2;
            int[] leftArr = new int[mid];
            int[] rightArr = new int[n - mid];

            for (int i = 0; i < mid; i++) {
                leftArr[i] = array[i];
            }
            for (int i = 0, j = mid; j < array.length; j++) {
                rightArr[i] = array[j];
                i++;
            }
            return merge(mergeSort(leftArr), mergeSort(rightArr));

        }

    }


    private int[] merge(int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        int[] array = new int[leftArray.length + rightArray.length];
        int leftLength = leftArray.length;
        int rightLength = rightArray.length;

        while (i < leftLength && j < rightLength) {
            if (leftArray[i] <= rightArray[j]) {
                array[k] = leftArray[i];
                i++;
            } else if (rightArray[j] < leftArray[i]) {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < leftLength) {
            array[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < rightLength) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
        return array;
    }
}
