package Basic99;

/**
 * Created by root on 12/10/15.
 */
public class TicTacToeGrid {

    public String[][] createTicTacToeGrid(int num){
        String[][] array = createArray(num);
        String[][] ticTacToeGrid = new String[num][1];
        for(int i = 0 ;i<num; i++) {
            ticTacToeGrid[i][0] = "";
            for (int j = 0; j < num; j++) {
                ticTacToeGrid[i][0] = ticTacToeGrid[i][0] + "|" + "\t" + array[i][j] +"\t";
            }
            ticTacToeGrid[i][0] = ticTacToeGrid[i][0] + "|";
        }
       return ticTacToeGrid;
    }

    public String[][] createArray(int num) {
        String[][] grid = new String[num][num];
        for (int i = 0; i < num; i++) {

            for (int j = 0; j < num; j++) {
                grid[i][j] = "X";
            }
        }
        return grid;
    }
}
