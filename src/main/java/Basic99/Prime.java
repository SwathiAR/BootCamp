package Basic99;

/**
 * Created by root on 12/9/15.
 */
public class Prime {

    public boolean isPrime(int num){
         if(num<=1){
             return  false;
         }

        for(int i =2 ; i<num/2;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;


    }
}
