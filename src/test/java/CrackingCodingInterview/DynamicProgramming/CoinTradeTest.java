package CrackingCodingInterview.DynamicProgramming;

import org.testng.Assert;
import org.testng.annotations.*;

import static org.testng.Assert.*;

/**
 * Created by root on 3/18/16.
 */
public class CoinTradeTest {
    CoinTrade trade = new CoinTrade();

    @org.testng.annotations.Test
    public void testCashORTrade() throws Exception {

      trade.cashORTrade(123);

    }
}