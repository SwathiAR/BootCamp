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


    public String doInsertionSort(String str){
        if(str==null || str.equals("")){
            return str;
        }
        char[] chars = str.toCharArray();

        for(int i = 0 ; i<chars.length-1 ; i++){
            for(int j = i+1 ; j>0 ; j--){
                if(chars[j] < chars[j-1]){
                    char temp = chars[j];
                    chars[j] = chars[j-1];
                    chars[j-1] = temp;
                }
            }
        }
return String.valueOf(chars);

    }

}
