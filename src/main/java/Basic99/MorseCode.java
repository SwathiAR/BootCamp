package Basic99;

/**
 * Created by root on 12/11/15.
 */
public class MorseCode {

    public static final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
            "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", "/"};

    public String getMorse(String str) {
        if (str == null || str.equals("")) {
            return str;
        }
        String morseCode = "";

        for (int i = 0; i < str.length(); i++) {
            if ((int) str.toUpperCase().charAt(i) == 32) {
                morseCode +=  morse[morse.length - 1] + " ";
            } else {
                morseCode += morse[(int) str.toUpperCase().charAt(i) - 65] + " ";


            }


        }
        return morseCode;
    }
}