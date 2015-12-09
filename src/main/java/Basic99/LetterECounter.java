package Basic99;

/**
 * Created by root on 12/8/15.
 */
public class LetterECounter {

    public int countE(String str){
        if(str==null || str.equals(" ")){
            return 0;
        }
        int count=0;


        for(int i = 0 ; i<str.length() ; i++){
            if(str.charAt(i)=='e'){
                count++;
            }
        }
        return  count;
    }
}
