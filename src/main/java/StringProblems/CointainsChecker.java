package StringProblems;

/**
 * Created by swathi on 11/23/2015.
 */
public class CointainsChecker {

    public boolean  contains(String str , String str2){

        if(str==null || str2==null || str.equals("") || str2.equals("")){
            return false;
        }

        char start = str2.charAt(0);
        for(int i = 0 ; i<str.length();i++){
            if(str.charAt(i) == start){
                for(int j = 0 ; j<str2.length() ; j++){
                    if(str.charAt(i)==str.charAt(j)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}