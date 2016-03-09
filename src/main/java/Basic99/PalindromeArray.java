package Basic99;

/**
 * Created by root on 12/8/15.
 */
public class PalindromeArray {
    public boolean isPalindrome(String[] array) {
        if (array == null || array.length==0) {
            return false;
        }
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            if (array[i] != array[length - i - 1]) {
                return false;
            }

        }

return  true;
    }
}

