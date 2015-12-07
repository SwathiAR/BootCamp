package Basic99;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/6/15.
 */
public class PatternPrinterTest {
    PatternPrinter p = new PatternPrinter();
    @Test
    public void testPrintPattern() throws Exception {
        p.printPattern(5);
        p.printPattern(1);
        p.printPattern(3);
    }
}