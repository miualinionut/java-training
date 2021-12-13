package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 8;
    public static int MAX_BOARD_HEIGHT = 8;

    private final Pawn[][] pieces;
    private int nrOfPawns;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate) && nrOfPawns < 8) {
            pieces[xCoordinate][yCoordinate] = pawn;
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pawn.setChessBoard(this);
            nrOfPawns++;
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if (xCoordinate < 0 || xCoordinate >= MAX_BOARD_HEIGHT || yCoordinate < 0 || yCoordinate >= MAX_BOARD_WIDTH)
            return false;
        else
            return pieces[xCoordinate][yCoordinate] == null;
    }
}
