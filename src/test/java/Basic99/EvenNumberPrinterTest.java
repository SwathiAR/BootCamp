package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

import static org.testng.Assert.*;

/**
 * Created by root on 12/6/15.
 */
public class EvenNumberPrinterTest {
    EvenNumberPrinter e = new EvenNumberPrinter();

    @Test
    public void testPrintEvenNumber() throws Exception {

        Assert.assertEquals(e.printEvenNumber(1).toString(), "[0]");
        Assert.assertEquals(e.printEvenNumber(9).toString() , "[0, 2, 4, 6, 8]");
    }
}