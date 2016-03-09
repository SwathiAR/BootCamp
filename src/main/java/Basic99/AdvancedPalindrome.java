package Basic99;

/**
 * Created by root on 12/8/15.
 */
public class AdvancedPalindrome {
    public boolean isPalindrome(String str){

        if(str==null || str.equals("")){
            return false;
        }

        else {
            char[] chars = str.toCharArray();
            int j = str.length()-1;
            int i = 0;
            while(i<j){
                if(Character.isLetter(chars[i]) && Character.isLetter(chars[j])){
                    if(Character.toLowerCase(chars[i]) != Character.toLowerCase(chars[j])){
                        return false;
                    }
                    i++;
                    j--;

                }
                else if(Character.isLetter(chars[i]) && !Character.isLetter(chars[j])){
                    j--;
                }
                else if(!Character.isLetter(chars[i]) && Character.isLetter(chars[j])){
                    i++;
                }


            }

        }



     return  true;
    }

}
