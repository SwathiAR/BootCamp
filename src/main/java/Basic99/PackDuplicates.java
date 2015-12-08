package Basic99;

import java.util.ArrayList;

/**
 * Created by root on 12/8/15.
 */
public class PackDuplicates {

    public String[] packDupliactes(char[] array){

        if(array==null ){
            return null;
        }
        else if(array.length==0){
            return new String[]{};
        }

        ArrayList<String> list = new ArrayList<String >();
        String s = String.valueOf(array[0]);

        for(int i = 1 ; i<array.length ; i++){

            if(array[i] == array[i-1]){
                s=s+String.valueOf(array[i]);
            }

            else{
                list.add(s);
                s= String.valueOf(array[i]);
            }
        }
            list.add(s);


     String[] result = new String[list.size()];
    for(int i = 0 ; i<list.size();i++){
         result[i] = list.get(i);
    }
return result;
    }
}
