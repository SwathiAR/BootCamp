package Basic99;

/**
 * Created by root on 12/9/15.
 */
public class SpellOut {

    public String spellOut(String str){
        if(str==null || str.equals("")){
            return  str;
        }

           StringBuilder sb = new StringBuilder();

            for(int i = 0 ; i<str.length()-1;i++){
                   if( str.charAt(i) != ' ' && str.charAt(i+1) != ' '){
                       sb.append(str.toUpperCase().charAt(i)).append('-');
                   }
                else
                       sb.append(str.toUpperCase().charAt(i));

            }

            sb.append(str.toUpperCase().charAt(str.length()-1));

return  String.valueOf(sb);

    }
}
