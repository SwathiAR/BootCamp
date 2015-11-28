/**
 * Created by swathi on 11/23/2015.
 */
public class EndsWithChecker {

    public boolean endsWith(String str , String str2){

        if(str==null || str2== null || str2.length()>str.length()){
            return false;
        }

        StringBuilder sb = new StringBuilder();

        for(int i =0 ;i<str2.length();i++){
            if (str.charAt(str.length()-i-1) != str2.charAt(str2.length()-i-1)){
                return false;
            }
        }
         return  true;

    }
}
