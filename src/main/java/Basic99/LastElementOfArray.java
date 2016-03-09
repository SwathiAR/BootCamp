package Basic99;

/**
 * Created by root on 12/7/15.
 * Write a method that returns the last element of a string array
 */
public class LastElementOfArray {
    public String getLastElemntOfStringArray(String[] array){
        if(array==null || array.length<1){
            return  null;
        }
        return  array[(array.length-1)];
    }
}
