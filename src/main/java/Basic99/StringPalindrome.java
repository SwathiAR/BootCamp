package Basic99;

/**
 * Created by root on 12/8/15.
 */
public class StringPalindrome {
    public boolean isPalindrome(String str){
        if(str==null || str.equals("")){
            return false;
        }


        else{
            int length = str.length();
            for(int i = 0 ; i< length/2 ; i++){
                if(str.charAt(i) != str.charAt(length-i-1)){
                    return  false;
                }

            }


        }



        return true;
    }

}
