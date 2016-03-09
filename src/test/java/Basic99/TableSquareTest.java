package Basic99;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/6/15.
 */
public class TableSquareTest {
    TableSquare t = new TableSquare();

    @Test
    public void testPrintTableSquare() throws Exception {
      t.printTableSquare(5);
        t.printTableSquare(0);
        t.printTableSquare(4);
    }
}