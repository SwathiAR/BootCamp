/**
 * Created by swathi on 11/23/2015.
 */
public class LetterECounter {

    public int countLetterE(String str) {
        if (str == null || str.equals("")) {
            return 0;

        }
        int count = 0;

        for(int i =0;i<str.length(); i++){
            if(str.charAt(i) == 'e'){
                ++count;
            }
        }
      return count;
    }
}
