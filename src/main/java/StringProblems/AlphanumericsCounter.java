package StringProblems;

/**
 * Created by swathi on 11/23/2015.
 */
public class AlphanumericsCounter {
    public int countAlphanumeric(String str){

        if(str==null || str.equals("")){
            return 0;
        }
        int count = str.length();
        for(int i=0;i<str.length(); i++){

                if(!Character.isLetterOrDigit(str.charAt(i))){
                    --count;
            }
        }
        return count;
    }

    public int countAlphanumeric1(String str){

        if(str==null || str.equals("")){
            return 0;
        }
        int count = 0;

        for(int i=0;i<str.length(); i++){
          if(str.charAt(i) > 47 && str.charAt(i) <58){
            ++count;
          }
            else if(str.charAt(i) > 64 && str.charAt(i) <91){
              ++count;
          }
           else if(str.charAt(i) > 96 && str.charAt(i) <123){
                ++count;
            }
        }
     return count;
    }

}
