/**
 * Created by swathi on 11/23/2015.
 */
public class StartsWithChecker {

    public boolean startsWith(String str , String str2){
        if(str==null || str2== null || str2.length()>str.length()){
            return false;
        }

        for(int i=0; i<str2.length();i++){
            if(str.charAt(i) != str2.charAt(i)){
                return false;
            }
        }
        return true;

    }
}
