package Sorting;

import java.util.Arrays;

/**
 * Created by swathi on 11/24/2015.
 */
public class BubbleSort {

    public String bubbleSort(String str){



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

    public String doBubleSort(String str){

        if(str==null || str.equals("")){
            return  null;
        }
        char[] chars = str.toCharArray();
        for(int i = 0 ; i<chars.length;i++){
            for(int j = 0 ; j<chars.length-1-i ; j++){
                if(chars[j] > chars[j+1]){
                    char temp = chars[j];
                    chars[j] = chars[j+1];
                    chars[j+1] = temp ;
                }
            }
        }




        return String.valueOf(chars);

    }
}
