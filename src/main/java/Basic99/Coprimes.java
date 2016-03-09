package Basic99;

/**
 * Created by root on 12/9/15.
 */
public class Coprimes {

    public boolean isCoprime(int num1 , int num2){
        Euclid e = new Euclid();
        int gcd = e.getGCD(num1, num2);
        if(gcd==1){
            return  true;
        }
        else return false;


    }
}
