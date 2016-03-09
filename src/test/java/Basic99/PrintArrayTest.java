package Basic99;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/7/15.
 * Print Array

 Write a method that prints out a string array, one element per line

 */
public class PrintArrayTest {
    PrintArray p = new PrintArray();
    String[] California = new String[]{"San Jose" , "SantaClara" ,"MountainView" , "PaloAlto" };
    String[] Cali = new String[1];

    @Test
    public void testPrintArray() throws Exception {
     p.printArray(Cali);
        p.printArray(California);

    }
}