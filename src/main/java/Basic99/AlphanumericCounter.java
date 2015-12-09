package Basic99;

/**
 * Created by root on 12/8/15.
 */
public class AlphanumericCounter {

    public int countAlphanumericValues(String str){
        if(str==null || str.equals(" ")){
            return  0;
        }
        int count = 0;

        for(int i = 0 ; i<str.length();i++){
            if((str.charAt(i) > 64 && str.charAt(i) < 91) ||
                    (str.charAt(i) > 96 && str.charAt(i) < 123) ||
                    (str.charAt(i) > 47 && str.charAt(i) < 58)){
                count++;
            }
        }

return count;

    }
}
