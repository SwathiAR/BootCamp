package CrackingCodingInterview;

/**
 *
 * Write code to reverse a C-Style String. (C-String means that “abcd” is represented as

 five characters, including the null character.)
 * Created by root on 12/14/15.
 */
public class ReverseCStyleString {

    public String reverse(String str){

        if(str==null || str.equals("")){
            return  str;
        }
        char[] chars = str.toCharArray();
        for(int i = 0 ; i<chars.length/2 ; i++){
            char temp = chars[i];
            chars[i] = chars[chars.length -2 -i];
            chars[chars.length-2-i] = temp;


        }

        return String.valueOf(chars);
    }
}
