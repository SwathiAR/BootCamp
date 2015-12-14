package CrackingCodingInterview;

/**
 * Created by root on 12/12/15.
 Implement an algorithm to determine if a string has all unique characters. What if you

 can not use additional data structures?*/
public class StringUniqueDetector {

    public boolean isUnique(String str) {
        if (str == null || str.equals("")) {
            return false;
        }

        int length = str.length();


        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    return false;
                }
            }

        }
        return true;
    }


    public boolean isUniqueString(String str){

        if (str == null || str.equals("")) {
            return false;
        }
        boolean[] chars = new boolean[256];

        for(int j = 0  ; j<str.length() ;j++){
            if(chars[str.charAt(j)]){
                return false;
            }
            else{
                chars[str.charAt(j)] = true;
            }
        }
        return true;
    }
}