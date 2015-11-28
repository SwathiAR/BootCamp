package Sorting;

import java.util.Arrays;

/**
 * Created by swathi on 11/24/2015.
 */
public class BubbleSort {

    public String bubbleSort(String str){

        int number = 8 + 'E';

        char x = 'a' + 8;

        char[] chars = str.toCharArray();

        for(int i = 0 ; i<chars.length;i++){
            for(int j=0 ; j<chars.length-i-1 ; j++){
                if(chars[j] > chars[j+1]){
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp;

                }
            }
        }
       return String.valueOf(chars);

    }
}
