package Basic99;

/**
 * Created by root on 12/9/15.
 */
public class VowelRemoval {

    public String removeVowel(String str){
        if(str==null || str.equals("")){
            return str;
        }

        char[] chars = str.toCharArray();

        for(int i = 0 ; i<str.length();i++){
            if(str.toLowerCase().charAt(i)== 'a' || str.toLowerCase().charAt(i)== 'e' || str.toLowerCase().charAt(i)== 'i'|| str.toLowerCase().charAt(i)== 'o'|| str.toLowerCase().charAt(i)== 'u'){
                chars[i] = '*';
            }
        }


       return  String.valueOf(chars);


    }

    public String removeVowel1(String str){

        if(str==null || str.equals("")){
            return str;
        }

        return str.replaceAll("[aeiouAEIOU]", "*");

    }

    public String removeVowel2(String str){
        if(str==null || str.equals("")){
            return str;
        }
        char[] chars = str.toCharArray();
        char[] vowels = {'a' , 'e' , 'i' , 'o' , 'u' };

        for(int i = 0 ; i<str.length();i++){
            for(int j = 0 ; j<vowels.length;j++){
                if(chars[i] == vowels[j]){
                    chars[i] = '*';
                }
            }
        }
        return String.valueOf(chars);
    }
}
