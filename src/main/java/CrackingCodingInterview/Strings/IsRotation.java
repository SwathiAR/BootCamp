package CrackingCodingInterview.Strings;

/**
 * Created by root on 12/16/15.
 *
 * Assume you have a method IsRotation which checks if one word is a substring of

 another. Given two strings, s1 and s2, write code to check if s2 is a rotation of s1 using

 only one call to IsRotation (i.e., “waterbottle” is a rotation of “erbottlewat”).
 */
public class IsRotation {

    public boolean IsRotation(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        } else if (s1.length() != s2.length()) {
            return false;
        } else {

            s1 = s1 + s1;

            if (s1.contains(s2)) {
                return true;
            }


        }


        return false;
    }


}
