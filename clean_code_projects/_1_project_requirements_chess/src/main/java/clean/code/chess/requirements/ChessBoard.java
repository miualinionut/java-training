package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH + 1][MAX_BOARD_HEIGHT + 1];
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (!IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            pawn.setYCoordinate(-1);
            pawn.setXCoordinate(-1);
            return;
        }

        pieces[xCoordinate][yCoordinate] = pawn;
        pawn.setXCoordinate(xCoordinate);
        pawn.setYCoordinate(yCoordinate);
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return 0 <= xCoordinate && xCoordinate < MAX_BOARD_HEIGHT
                && 0 <= yCoordinate && yCoordinate < MAX_BOARD_WIDTH
                && pieces[xCoordinate][yCoordinate] == null;
    }

    public void movePiece(Pawn pawn, int newX, int newY) {
        Pawn old;
        old = pieces[pawn.getXCoordinate()][pawn.getYCoordinate()];
        if (old != null && old != pawn) {
            old.setYCoordinate(-1);
            old.setXCoordinate(-1);
        }
        pieces[pawn.getXCoordinate()][pawn.getYCoordinate()] = null;
        pieces[newX][newY] = pawn;
    }
}
