package CrackingCodingInterview.DynamicProgramming;

/**
 * Created by root on 3/18/16.
 */
public class CoinTrade {

    public void cashORTrade(int x){
        if(x<=0){
            System.out.println("Zero Coin");
        }

      int result =  Math.max(x, (x / 3 + x / 2 + x / 4));
        if(result != x){
            System.out.println( "Trade " + x  );
            cashORTrade((x / 3));
            cashORTrade((x / 2));
            cashORTrade((x/4));
        }
        else{
            System.out.println( "Cash " + x) ;
        }



    }


}
