package Basic99;

/**
 * Created by root on 12/8/15.
 */
public class StringReversal {

    public String reverseString(String str){

        if(str==null ||str.length()<1){
            return  str;
        }

        int length = str.length();
        char[] chars = str.toCharArray();
        for(int i = 0 ; i<length/2;i++){
            char temp = chars[i];
            chars[i] = chars[length-1-i];
            chars[length-1-i] = temp;
        }

      return String.valueOf(chars);
    }


    public String reverseRecursively(String str){
        if(str==null ||str.length()<=1){
            return  str;
        }

        else return  reverse(str.toCharArray() , 0 , str.length()-1);

    }

    private String reverse(char[] chars, int start, int end) {
        if(start>end){
           return  String.valueOf(chars);
        }
        else{
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            return  reverse(chars , start+1 , end-1);


        }
    }

}
