package Basic99;

/**
 * Created by root on 12/15/15.
 *
 * 2,5,5 ----> 2,5 ,6
 */
public class Final {
    public int[] getArray(final int[] array){

        array[array.length-1]++;
        return array;
    }
}
