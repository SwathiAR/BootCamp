package Basic99;

/**
 * Created by root on 12/9/15.
 */
public class Euclid {
    public int getGCD(int num1 , int num2){

        if(num1==0 ){
            return num2;
        }
       else if(num2==0){
            return num1;
        }

        else {
            if(num1>num2){
              return   getGCD(num1-num2 , num2);
            }
            else return getGCD(num1 , num2-num1);
        }



    }
}
