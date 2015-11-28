/**
 * Created by swathi on 11/23/2015.
 */
public class NthElementRemoval {

    public String removeNthElement(String str , int element){

        if(str==null || str.equals("")){
            return str;
        }
        if(element >= str.length()){
            throw new  RuntimeException("Element asked to be removed is greater than the String length  ");
        }
        StringBuilder sb = new StringBuilder();

        for(int i = 0 ; i<element;i++){
            sb.append(str.charAt(i));
        }
        for(int i= element+1 ;i<str.length();i++){
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }


    public String removeNthElement1(String str , int element){

        if(str==null || str.equals("")){
            return str;
        }

        if(element >= str.length()){
            throw new  RuntimeException("Element asked to be removed is greater than the String length  ");
        }

        return str.substring(0 , element ) + str.substring(element+1);
    }
}
