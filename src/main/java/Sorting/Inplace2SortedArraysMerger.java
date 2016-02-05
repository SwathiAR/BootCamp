package Sorting;

/**
 * Created by root on 2/4/16.
 */
public class Inplace2SortedArraysMerger {

    public int[] merge(int[] a , int[] b  ){

        int length1 = a.length;
        int length2 = b.length;
        int i , j , k;
             i = length1-length2 -1;
             j = length2-1;
             k = length1-1;

        while(i>=0 && j >=0 ) {
            if (a[i] <= b[j]) {
                a[k] = b[j];
                k--;
                j--;
            } else {
               a[k] = a[i];
                k--;
                i--;
            }
        }

        while(i>=0){
            a[k--] = a[i--];
        }

        while(j>=0){
            a[k--] = b[j--];
        }


return a;
    }
}
