package Basic99;

import java.util.ArrayList;

/**
 * Created by root on 12/9/15.
 */
public class PrimeFactor {

    public ArrayList<Integer> calculatePrimeFactor(int num){

        if(num == 0){
            return  new ArrayList<Integer>();
        }
        else
        {
            ArrayList<Integer> list = new ArrayList<Integer>();

            for(int i=2;i<=num/i;i++){
                while(num%i==0){
                    list.add(i);
                    num= num/i;
                }
            }
            if(num>1) {
                list.add(num);
            }
            return list;
        }

    }

}
