package CrackingCodingInterview;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by root on 12/14/15.
 *
 * Design an algorithm and write code to remove the duplicate characters in a string

 without using any additional buffer. NOTE: One or two additional variables are fine.

 An extra copy of the array is not.
 */
public class RemoveDuplicates {
    public String removeDuplicates(char[] str) {

        for (int i = 0; i < str.length - 2; i++) {
            for (int j = i + 1; j < str.length - 1; j++) {
                if (str[i] == str[j]) {
                    str[j] = 0;
                }
            }

        }
        return String.valueOf(str);
    }


    public char[] removeDuplicates2(char[] str) {

        if (str == null || str.length < 2) {
            return str;
        }

        int tail = 1;

        for (int i = 1; i < str.length; i++) {
            int j;
            for (j = 0; j < tail; j++) {

                if (str[i] == str[j]) {
                    break;
                }
                if (j == (tail - 1)) {
                    str[tail] = str[i];
                    ++tail;
                }
            }
        }

        while (tail < str.length) {
            str[tail++] = 0;
        }


        return str;

    }


    /*
    Algorithm—With Additional Memory
     */
    public char[] removeDuplicates3(char[] str) {

        if (str == null || str.length < 2) {
            return str;
        }

        LinkedHashSet<Character> set = new LinkedHashSet<Character>();

        for (char c : str) {
            set.add(c);
        }


        Iterator<Character> iterator = set.iterator();
        int i = 0;
        while (iterator.hasNext()) {
            str[i++] = iterator.next();
        }

        while (i < str.length) {
            str[i++] = 0;
        }

        return str;
    }


    /*
    Algorithm—With Additional Memory of Constant Size
     */
    public char[] removeDuplicates4(char[] str) {
        if(str==null || str.length<2){
            return str;
        }

        boolean[] stringSetter = new boolean[256]; //Assuming only ASCI characters
        int tail = 1;
        stringSetter[str[0]] = true;

        for (int i = 1; i < str.length; i++) {
            if (!stringSetter[str[i]]) {
                stringSetter[str[i]] = true;
                str[tail++] = str[i];
            }
        }

        while (tail < str.length) {
            str[tail++] = 0;
        }
        return str;
    }
}






