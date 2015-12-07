package Basic99;

import java.util.ArrayList;

/**
 * Created by root on 12/6/15.
 */
public class EvenNumberPrinter {
    public ArrayList<Integer> printEvenNumber(int n){
        ArrayList<Integer> l = new ArrayList<Integer>();

        if(n<1){
            l.add(-1);
            return l;
        }


        for(int i = 0 ; i<n ; i++){
            if(i%2==0){
                l.add(i);
            }
        }

        return l;


    }
}
