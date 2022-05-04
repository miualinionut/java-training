package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    public static int nrOfPieces = 0;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (nrOfPieces > 8)
            return;
        if (IsLegalBoardPosition(xCoordinate, yCoordinate) == false) {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
            return;
        }
        pawn.setXCoordinate(xCoordinate);
        pawn.setYCoordinate(yCoordinate);
        pawn.setChessBoard(this);
        pieces[xCoordinate][yCoordinate] = pawn;
        nrOfPieces++;
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if (xCoordinate < 0 || xCoordinate >= MAX_BOARD_WIDTH)
            return false;
        if (yCoordinate < 0 || yCoordinate >= MAX_BOARD_HEIGHT)
            return false;
        return pieces[xCoordinate][yCoordinate] == null;
    }
}
