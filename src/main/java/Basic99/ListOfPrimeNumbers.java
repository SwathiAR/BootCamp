package Basic99;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by root on 12/9/15.
 */
public class ListOfPrimeNumbers {

    public HashSet<Integer> getPrimeNumbers(int num1 , int num2){

        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = num1;i<=num2;i++){
            boolean isPrime = true;
           for(int j=2 ; j<i;j++){
               if(i%j==0){
                   isPrime = false;
               }
           }
         if( isPrime){
                set.add(i);
         }
        }

        return set;
    }
}
