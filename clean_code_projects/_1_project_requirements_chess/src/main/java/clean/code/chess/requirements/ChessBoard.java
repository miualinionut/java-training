package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (!IsLegalBoardPosition(xCoordinate, yCoordinate) || pieces[xCoordinate][yCoordinate] != null) {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        } else {
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pieces[xCoordinate][yCoordinate] = pawn;
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if (xCoordinate >= 0 && xCoordinate < MAX_BOARD_WIDTH)
            if (yCoordinate >= 0 && yCoordinate < MAX_BOARD_HEIGHT)
                return true;
        return false;

    }
}