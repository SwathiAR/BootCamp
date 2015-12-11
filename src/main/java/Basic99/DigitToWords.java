package Basic99;

/**
 * Created by root on 12/10/15.
 */
public class DigitToWords {
    public String[] getWords(String digits){
        String[] words = new String[digits.length()];
        String[] givenWords = {"Oh" , "One" , "Two" , "Three" , "Four" , "Five" , "Six" , "Seven" ,"Eight" , "Nine"};

        for(int i = 0 ; i<digits.length();i++){
            int c = (int)digits.charAt(i)-48;
            words[i] = givenWords[c];


        }

      return  words;
    }
}
