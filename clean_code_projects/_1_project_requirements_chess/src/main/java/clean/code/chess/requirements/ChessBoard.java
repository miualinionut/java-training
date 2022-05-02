package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;
    private static int numberOfPawns = 0;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        pawn.setChessBoard(this);
        numberOfPawns ++;
        if (IsLegalBoardPosition(xCoordinate, yCoordinate) && numberOfPawns <= 2 * MAX_BOARD_WIDTH) {
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            this.pieces[xCoordinate][yCoordinate] = pawn;
        }
        else {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }
        //    throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }

    public void UpdateChessboard(Pawn pawn, int xCoordinate, int yCoordinate) {
        pawn.setChessBoard(this);
        if (IsLegalBoardPosition(xCoordinate, yCoordinate)) {
            int oldX = pawn.getXCoordinate();
            int oldY = pawn.getYCoordinate();
            this.pieces[oldX][oldY] = null;
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            this.pieces[xCoordinate][yCoordinate] = pawn;
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if (xCoordinate >= 0 && xCoordinate < MAX_BOARD_WIDTH && yCoordinate >= 0 && yCoordinate < MAX_BOARD_HEIGHT)
            return true;
        else return false;
        //    throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
    }
}
