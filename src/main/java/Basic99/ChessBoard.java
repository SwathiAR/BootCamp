package Basic99;

/**
 * Created by root on 12/10/15.
 */
public class ChessBoard {
    public String[][] createChessBoard(){
        String[][] chessBoard = new String[8][8];

        for(int i = 0 ; i<8;i++){
            for(int j=0 ; j<8 ;j+=2){
                chessBoard[i][j] = "X";
            }
        }


        return chessBoard;
    }


}
