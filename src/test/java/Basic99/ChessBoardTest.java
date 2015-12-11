package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Created by root on 12/10/15.
 */
public class ChessBoardTest {
    ChessBoard c = new ChessBoard();
    String[][] b = new String[][]{

            {"X" ,"O" , "X" , "O" , "X" , "O" , "X" , "O"},
            {"O" , "X" , "O" , "X" , "O" , "X" , "O" , "X"},
            {"X" ,"O" , "X" , "O" , "X" , "O" , "X" , "O"},
            {"O" , "X" , "O" , "X" , "O" , "X" , "O" , "X"},
            {"X" ,"O" , "X" , "O" , "X" , "O" , "X" , "O"},
            {"O" , "X" , "O" , "X" , "O" , "X" , "O" , "X"},
            {"X" ,"O" , "X" , "O" , "X" , "O" , "X" , "O"},
            {"O" , "X" , "O" , "X" , "O" , "X" , "O" , "X"},


    };

    String[] representation = new String[]{

            "|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|",
            "|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|",
            "|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|",
            "|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|",
            "|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|",
            "|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|",
            "|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|",
            "|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|\tO\t|\tX\t|"



    };


    @Test
    public void testCreateChessBoard() throws Exception {
        Assert.assertEquals(c.createChessBoard() ,b );
        Assert.assertEquals(c.printChessBoard(b) , representation);
    }
}