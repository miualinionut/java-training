package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {

        if(!IsLegalBoardPosition(xCoordinate, yCoordinate) || pieces[xCoordinate][yCoordinate] != null) {
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
        }
        else
        {
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pieces[xCoordinate][yCoordinate] = pawn;
        }


    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {

        if(xCoordinate >= 0 && xCoordinate < MAX_BOARD_HEIGHT)
            if(yCoordinate >= 0 && yCoordinate < MAX_BOARD_WIDTH)
                return true;

        return false;
    }

    public void MoveChess(Pawn pawn, int X, int Y) {

        if(!IsLegalBoardPosition(X, Y))
            return;

        if(pieces[X][Y] != null) {
            pieces[X][Y].setXCoordinate(-1);
            pieces[X][Y].setYCoordinate(-1);
            pieces[X][Y] = null;
        }

        pieces[X][Y] = pawn;
    }

}
