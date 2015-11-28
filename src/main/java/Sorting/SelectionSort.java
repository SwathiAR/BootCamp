package Sorting;

/**
 * Created by swathi on 11/24/2015.
 */
public class SelectionSort {
    public String selectionSort(String str){
        char[] chars = str.toCharArray();


        for(int i=0;i<chars.length;i++){
            for(int j = i+1; j<chars.length;j++){
                if(chars[i] > chars[j]){
                    char temp = chars[i];
                    chars[i] = chars[j];
                    chars[j] = temp;
                }

            }
        }
        return String.valueOf(chars);
    }
}
