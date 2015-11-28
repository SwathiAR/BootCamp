package StringProblems;

/**
 * Created by swathi on 11/24/2015.
 */
public class SpellUp {
    public String spellUp(String str){

        if(str==null || str.equals(" ")){
            return  str;
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length()-1;i++){
            if(str.charAt(i)!=' '){
                sb.append(str.charAt(i)).append("-");
            }
        }
        return String.valueOf(sb.append(str.charAt(str.length()-1)));
    }
}
