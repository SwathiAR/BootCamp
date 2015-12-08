package Basic99;

/**
 * Created by root on 12/8/15.
 */
public class WordCounter {

    public int countWords(String str){
        if(str==null || str.equals(" ")){
            return 0;
        }
        int count = 1;
        for(int i = 0 ; i<str.length() ; i++){
           if (str.charAt(i) == ' ' && str.charAt(i+1)!= ' '){
                count++;

            }
        }

        return count;
    }
}
