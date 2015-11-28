/**
 * Created by swathi on 11/24/2015.
 */
public class VowelReplacementWithStar {
    public String replaceVowels(String str){
        if(str==null ||str.equals("")){
            return str;
        }

        char[] chars = str.toLowerCase().toCharArray();
        char[] vowels = {'a','e' ,'i' ,'o' ,'u'};
        for(int i =0; i<chars.length;i++){
            for(int j=0;j<vowels.length;j++){
                if(str.charAt(i)==vowels[j]){
                    chars[i] = '*';
                }
            }
        }
        return  String.valueOf(chars);

    }

    public String replaceVowels1(String str){
        StringBuilder sb = new StringBuilder();
        for(int i =0;i<str.length();i++){
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i)== 'i' || str.charAt(i) == 'o' || str.charAt(i)=='u'){
                sb.append('*');
            }
            else
                sb.append(str.charAt(i));
        }
     return  str.toString();
    }


}
