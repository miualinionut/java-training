package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH+1][MAX_BOARD_HEIGHT+1];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(!(IsLegalBoardPosition(xCoordinate, yCoordinate))){
            return;
        }
        if(xCoordinate!= 1 && pieceColor == PieceColor.WHITE){
            return;
        }
        if(!(IsFreePosition(xCoordinate, yCoordinate)) || (xCoordinate == 7 && pieceColor == PieceColor.BLACK)){
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
            return;
        }
        if(xCoordinate == 6 || pieceColor != PieceColor.BLACK){
            pawn.setXCoordinate(xCoordinate);
            pawn.setYCoordinate(yCoordinate);
            pieces[xCoordinate][yCoordinate] = pawn;
        }
        //throw new UnsupportedOperationException("Need to implement ChessBoard.add()");
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(xCoordinate <= MAX_BOARD_WIDTH && yCoordinate <= MAX_BOARD_HEIGHT && xCoordinate >= 0 && yCoordinate >= 0){
            return true;
        }
        return false;
        //throw new UnsupportedOperationException("Need to implement ChessBoard.IsLegalBoardPosition()");
    }

    public boolean IsFreePosition(int x, int y){
        if(pieces[x][y] == null){
            return true;
        }
        return false;
    }
}
