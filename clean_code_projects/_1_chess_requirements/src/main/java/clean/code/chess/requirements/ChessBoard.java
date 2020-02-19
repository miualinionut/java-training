package clean.code.chess.requirements;

import javax.sql.XAConnection;
import java.util.ArrayList;
import java.util.List;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    public static int MIN_BOARD_HEIGHT = 0;
    public static int MIN_BOARD_WIDTH = 0;

    private Pawn[][] pieces;

    public ChessBoard() {

        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {

        if(!IsLegalBoardPosition(xCoordinate,yCoordinate)){
            pawn.setYCoordinate(-1);
            pawn.setXCoordinate(-1);
        }
        else{
            if((pieceColor == PieceColor.BLACK && xCoordinate == 6) || (pieceColor == PieceColor.WHITE && xCoordinate == 1)){
                pawn.setYCoordinate(yCoordinate);
                pawn.setXCoordinate(xCoordinate);
            }
            else{
                pawn.setYCoordinate(-1);
                pawn.setXCoordinate(-1);
            }
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {

        if(xCoordinate > MAX_BOARD_HEIGHT || yCoordinate > MAX_BOARD_WIDTH || xCoordinate < MIN_BOARD_HEIGHT || yCoordinate < MIN_BOARD_WIDTH)
            return false;
        return true;
    }
}
