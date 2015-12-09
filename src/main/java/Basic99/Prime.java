package Basic99;

/**
 * Created by root on 12/9/15.
 */
public class Prime {

    public boolean isPrime(int num){


        for(int i =2 ; i<10;i++){
            if(num%i==0 && i!=num){
                return false;
            }
        }
        return true;


    }
}
