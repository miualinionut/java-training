package clean.code.chess.requirements;

import java.awt.*;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private final Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (!IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
            return;
        }

        pawn.setXCoordinate(xCoordinate);
        pawn.setYCoordinate(yCoordinate);
        pawn.setPieceColor(pieceColor);
        pieces[xCoordinate][yCoordinate] = pawn;
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if( xCoordinate >= 7 || xCoordinate < 0 )
            return false;
        if( yCoordinate >= 7 || yCoordinate < 0 )
            return false;
        return pieces[xCoordinate][yCoordinate] == null;
    }

    public boolean IsNotEmptyPosition(int xCoordinate, int yCoordinate) {
        if (xCoordinate >= 7 || xCoordinate < 0)
            return false;
        if (yCoordinate >= 7 || yCoordinate < 0)
            return false;
        return pieces[xCoordinate][yCoordinate] != null;
    }
}
