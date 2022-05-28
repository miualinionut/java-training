package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public boolean checkDimension(int MAX_BOARD_HEIGHT, int MAX_BOARD_WIDTH){
        if(MAX_BOARD_HEIGHT == 7 && MAX_BOARD_WIDTH == 7){
            return true;
        }
        return false;
    }

    public boolean isAvailable(int x, int y) {
        return this.pieces[x][y]==null;
    }

    public boolean IsLegalBoardPosition (int xCoordinate, int yCoordinate){
        if (xCoordinate < 7 && yCoordinate < 7 && xCoordinate >= 0 && yCoordinate >= 0){
         return true;
        }
        return false;
    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if(IsLegalBoardPosition(xCoordinate, yCoordinate)&& isAvailable(xCoordinate, yCoordinate) ){
          pawn.setPieceColor(pieceColor);
          pawn.setXCoordinate(xCoordinate);
          pawn.setYCoordinate(yCoordinate);
          pawn.setChessBoard(this);
          pieces[xCoordinate][yCoordinate] = pawn;
        }
        else{
            pawn.setXCoordinate(-1);
            pawn.setYCoordinate(-1);
            pawn.setChessBoard(this);
        }
    }
}
