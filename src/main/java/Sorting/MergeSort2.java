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




    public  int[] doMergeSort(int[] array){
        if(array == null || array.length <2){
            return array;
        }


        int length = array.length;
        int mid = length/2;
        int[] left = new int[mid];
        int[] right = new int[length-mid];

        for(int i = 0 ; i<mid ; i++){
            left[i] = array[i];
        }
        for(int j = 0 ,i = mid ; i<length ; i++ , j++){
            right[j] = array[i];
        }
        int[] leftSorted = doMergeSort(left);
        int[] rightSorted = doMergeSort(right);

        return merge1(leftSorted, rightSorted);

    }

    private int[] merge1(int[] left, int[] right) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[left.length + right.length];
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k] = left[i];
                k++;
                i++;
            } else {
                result[k] = right[j];
                k++;
                j++;
            }
        }

        while(i<left.length){
            result[k++] = left[i++];
        }

        while ((j<right.length)){
            result[k++] = right[j++];


        }
        return result;
    }
}