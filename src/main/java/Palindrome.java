/**
 * Created by swathi on 11/22/2015.
 */
public class Palindrome {

    public boolean isPalindrome(String str ){

        if(str == null || str.equals("")){
            return false;
        }

        for(int i=0 ; i<(str.length())/2 ; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {

                return false;
            }
        }
        return true;



    }

    public  boolean isPalindrome2(String str){

        if(str == null || str.equals("")){
            return false;
        }
        StringBuilder sb = new StringBuilder();

        for(int i = str.length()-1 ; i >= 0; i--){
            sb.append(str.charAt(i));

        }
        return sb.toString().equals(str);
    }

}
