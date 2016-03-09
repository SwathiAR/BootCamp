package Basic99;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by root on 12/10/15.
 */
public class TicTacToeGridTest {
    TicTacToeGrid grid = new TicTacToeGrid();

    @Test
    public void testCreateTicTacToeOfX() throws Exception {
        String[][] g = {
    { "|\tX\t|\tX\t|\tX\t|" },
                { "|\tX\t|\tX\t|\tX\t|" },
                { "|\tX\t|\tX\t|\tX\t|" }
        };

        Assert.assertEquals(grid.createTicTacToeGrid(3), g);
        String[][] ticTacToeGrid = grid.createTicTacToeGrid(3);
        Assert.assertEquals(ticTacToeGrid[0][0] , g[0][0]);
       Assert.assertEquals(ticTacToeGrid[1][0] , g[1][0]);
       Assert.assertEquals(ticTacToeGrid[2][0] , g[2][0]);


    }
}