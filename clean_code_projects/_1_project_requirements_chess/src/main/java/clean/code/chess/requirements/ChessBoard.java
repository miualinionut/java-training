package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (IsLegalBoardPosition(xCoordinate, yCoordinate) && IsPositionAvailable(pieces[xCoordinate][yCoordinate], xCoordinate, yCoordinate)) {
            pawn.setChessBoard(this);
            pawn.setYCoordinate(yCoordinate);
            pawn.setXCoordinate(xCoordinate);
            pieces[xCoordinate][yCoordinate] = pawn;
        }
        else {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }

        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }
    private boolean IsPositionAvailable(Pawn pawn, int testX, int testY){
        if(pawn.getXCoordinate() == testX && pawn.getYCoordinate() == testY)
            return false;
        else
            return true;
    }
    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if ((xCoordinate >= 0 && xCoordinate < MAX_BOARD_WIDTH) && (yCoordinate >= 0 && yCoordinate <= MAX_BOARD_HEIGHT))
            return true;
        else
            return false;
        //   throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
    }
}
