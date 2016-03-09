package Basic99;

/**
 * Created by root on 12/10/15.
 */
public class ChessBoard {
    public String[][] createChessBoard() {
        String[][] chessBoard = new String[8][8];

        for (int i = 0; i < 8; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 7; j += 2) {

                    chessBoard[i][j] = "X";
                    chessBoard[i][j + 1] = "O";
                }
            } else {
                for (int j = 0; j < 7; j += 2) {

                    chessBoard[i][j] = "O";
                    chessBoard[i][j + 1] = "X";
                }

            }
        }


        return chessBoard;
    }

    public String[] printChessBoard(String[][] board) {

        String[] chessBoardPicture = new String[8];

        for (int i = 0; i < 8; i++) {
            chessBoardPicture[i] = "";
            for (int j = 0; j < 8; j++) {
                chessBoardPicture[i] = chessBoardPicture[i] + "|" + "\t" + board[i][j] + "\t";
            }
            chessBoardPicture[i] += "|";
        }

        return chessBoardPicture;
    }
}
