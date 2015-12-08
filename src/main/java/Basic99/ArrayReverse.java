package Basic99;

/**
 * Created by root on 12/7/15.
 Write a method that reverses the elements of an Array
 */
public class ArrayReverse {

    public String[] reverseArray(String[] array){
        int length = array.length;
        for(int i = 0 ; i<(length/2) ; i++){
            String temp = array[i];
            array[i] = array[length-i-1];
            array[length-i-1] = temp;
        }
        return  array;
    }

    public String[] recursiveReverse(String[] array){

        if(array==null) {
        return  null;
        }
        else return reverse(array , 0 , array.length-1);


    }

    private String[] reverse(String[] array , int start , int end) {
        if (start >= end) {
            return array;
        } else {
            String temp = array[start];
            array[start] = array[end];
            array[end] = temp;


            return reverse(array, start + 1, end - 1);
        }
    }
}
