package Basic99;

/**
 * Created by root on 12/9/15.
 */
public class SubstitutionDecoder {

    public String decode(String str){

        if(str==null || str.equals("")){
            return  str;
        }

        else{

            char[] chars = str.toCharArray();
            for(int i = 0 ; i<str.length();i++){
                chars[i] = (char)((str.charAt(i) + 64));
            }





            return String.valueOf(chars);
        }



    }
}
