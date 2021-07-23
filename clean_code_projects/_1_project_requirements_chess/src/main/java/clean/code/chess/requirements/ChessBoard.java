package clean.code.chess.requirements;

import clean.code.chess.requirements.attributes.PieceColor;
import clean.code.chess.requirements.pieces.Pawn;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private final Pawn[][] pieces;

    public ChessBoard() {
        this.pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        // throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
        if (!IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        } else {
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pawn.setPieceColor(pieceColor);

            pieces[xCoordinate][yCoordinate] = pawn;
        }
    }

    public static boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        // throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
        return xCoordinate >= 0 && xCoordinate < 7 &&
                yCoordinate >= 0 && yCoordinate < 7;
    }
}
