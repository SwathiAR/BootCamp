package CrackingCodingInterview.Strings;


import java.util.Arrays;

/**
 * Created by root on 12/15/15.
 */
public class Anagrams {

    public boolean isAnagram(String str , String str2) {

        if (str == null || str2 == null) {
            return false;
        } else if (str.length() != str2.length()) {
            return false;
        } else {
            char[] chars = str.toLowerCase().toCharArray();
            char[] chars2 = str2.toLowerCase().toCharArray();

            Arrays.sort(chars);
            Arrays.sort(chars2);

            return Arrays.equals(chars2, chars);

        }
    }

    public boolean isAnagram1(String str , String str2){

        if(str==null || str2==null){
            return false;
        }
        else if(str.length()!=str2.length()){
            return  false;
        }
        char[] chars = str.toCharArray();
        char[] chars1 = str2.toCharArray();
        int[] setter = new int[256];

        for (char aChar : chars) {
            setter[aChar] += 1;
        }

        for(char aChar : chars1){
                setter[aChar]-= 1;
            }

        for (int i : setter) {
            if(i!=0){
                return false;
            }
        }

        return true;
    }

    public boolean isAnagram2(String str , String str2) {
        if (str == null || str2 == null) {
            return false;
        } else if (str.length() != str2.length()) {
            return false;
        } else {
            char[] chars = str.toCharArray();
            char[] chars1 = str2.toCharArray();
            int[] setter = new int[256];

            int numOfUniqueChars = 0;
            int numbersCopletedinStr2 = 0;

            for (int i = 0; i < chars.length; i++) {
                if (setter[chars[i]] == 0) {
                    ++numOfUniqueChars;
                }
                ++setter[chars[i]];
            }

            for (int i = 0; i < chars1.length; i++) {
                if (setter[chars1[i]] == 0) {
                    return false;
                }

                --setter[chars1[i]];
                if (setter[chars1[i]] == 0) {
                    ++numbersCopletedinStr2;
                }

                if (numbersCopletedinStr2 == numOfUniqueChars) {
                    return i == chars1.length - 1;
                }


            }

        }
        return false;
    }
}
