package StringProblems;

/**
 * Created by swathi on 11/24/2015.
 *
 * In a simple substitution cipher, A =1 , B=2, C=3 etc. Write a method that encodes a sentence using this cipher

 1:  StringProblems s = "Hello World"
 2:
 3:  encode(s)
 4:   *** Output ***
 5:  8,5,12,12,15 23,15,18,12,4
 */
public class Substitution {

    public String substitute(String str){
        str.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<str.length(); i++){
            sb.append( str.charAt(i) - 96);
        }
return  String.valueOf(sb);
    }

}
