package CrackingCodingInterview.Strings;

/**
 * 1.5 Write a method to replace all spaces in a string with ‘%20’.
 * Created by root on 12/15/15.
 */
public class ReplaceFun {
    public String replace(String str ){
        if(str==null || str.equals("")){
            return str;
        }

        int numOfSpaces = 0;

        char[] chars = str.toCharArray();
        for(int i = 0 ; i<str.length() ; i++){
            if(chars[i] == ' '){
                ++numOfSpaces;
            }
        }

        char[] replacedArray = new char[str.length() + (numOfSpaces*2)];
        int j = -1;
        for(int i = 0 ; i<chars.length; i++){
            if(chars[i] == ' '){
                replacedArray[++j] = '%';
                replacedArray[++j] = '2';
                replacedArray[++j] = '0';
            }
            else{
                replacedArray[++j] = chars[i];
            }
        }

  return  String.valueOf(replacedArray);
    }

}
