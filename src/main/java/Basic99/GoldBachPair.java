package Basic99;

/**
 * Created by root on 12/10/15.
 Goldbach’s conjecture says that every positive even number greater than 2 is the sum of two prime numbers. Example: 28 = 5 + 23. It is one of the most famous facts in number theory that has not been proved to be correct in the general case. It has been numerically confirmed up to very large numbers. Write a predicate to find the two prime numbers that sum up to a given even number.


 */
public class GoldBachPair {
    Prime p = new Prime();

public int[] getGoldBachPair(int num){
    int temp = num;
    int[] pair = new int[2];

    while(temp>2){
        if (p.isPrime(--temp) && p.isPrime(num-temp )){
            pair[0] = temp;
            pair[1] = num-temp;
            break;
        }

    }





    return pair;
}

    public int[] getBigGoldBachPair(int num , int min) {
        int temp = num;
        int[] pairs = new int[2];
       while(temp>2){
           if(p.isPrime(--temp) && p.isPrime(num-temp) && temp>min && (num-temp)>min){

                   pairs[0] = temp;
                   pairs[1] = num-temp;
                   break;

           }


       }
     return pairs;
    }
}
