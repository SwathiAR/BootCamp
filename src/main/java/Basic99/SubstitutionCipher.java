package Basic99;

/**
 * Created by root on 12/9/15.
 */
public class SubstitutionCipher {
    public int[] encode(String str){
        if(str==null || str.equals("")){
            return new int[]{};
        }
        int[] code = new int[str.length()];

        for(int i = 0 ; i<str.length();i++){
            code[i] = (str.toUpperCase().charAt(i)-64);
        }

        return code;

    }
}
