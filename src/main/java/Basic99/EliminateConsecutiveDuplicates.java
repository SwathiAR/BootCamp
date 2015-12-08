package Basic99;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by root on 12/8/15.
 */
public class EliminateConsecutiveDuplicates {
    public int[] eliminateConsecutiveDuplicates(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(array[0]);
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                l.add(array[i]);

            }

        }
        int[] result = new int[l.size()];
        int i = 0;
        for(int integer: l){
            result[i] =integer;
            i++;
        }

        return result;
    }
}
