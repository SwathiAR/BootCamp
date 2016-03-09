package Basic99;

/**
 * Created by root on 12/9/15.
 */
public class SubstitutionDecoder {

    public String decode(int[] code){

        if(code==null ){
            return  null;

        }
        else if (code.length< 1){
            return "";
        }

        else{
            StringBuilder sb = new StringBuilder();


            for(int i = 0 ; i<code.length;i++){
             ;
                sb.append(Character.toString( (char)((code[i] + 64))));
            }






            return String.valueOf(sb);
        }



    }
}
