package CrackingCodingInterview;


import java.util.Arrays;

/**
 * Created by root on 12/15/15.
 */
public class Anagrams {

    public boolean isAnagram(String str , String str2){
        char[] chars = str.toLowerCase().toCharArray();
        char[] chars2 = str2.toLowerCase().toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chars2);

        return Arrays.equals(chars2 , chars);

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
}
