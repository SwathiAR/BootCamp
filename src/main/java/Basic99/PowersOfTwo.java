package Basic99;

import java.util.ArrayList;

/**
 * Created by root on 12/6/15.
 */
public class PowersOfTwo {
    public ArrayList<Integer> calculatePowersOfTwo(int n) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int product = 1;
        if(n<1){
            return  null;

        } else {
            for (int i = 1; i <= n; i++) {
                product *= 2;
                list.add(product);
            }

        }
        return list;
    }
}