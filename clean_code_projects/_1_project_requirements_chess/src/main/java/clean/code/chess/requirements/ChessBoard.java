package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    boolean result = true;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if ((pieceColor == PieceColor.WHITE) && (xCoordinate == 6) && (yCoordinate <= 7)){

        }else if (((pieceColor == PieceColor.BLACK) && (xCoordinate == 1) && (yCoordinate <= 7))){
            pieces = new Pawn[xCoordinate][yCoordinate];
        }else {
            System.out.println("This is not a valid place for the pawn");
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
     if ((xCoordinate <= MAX_BOARD_WIDTH && xCoordinate >= 0) && (yCoordinate <= MAX_BOARD_HEIGHT && yCoordinate >= 0)){
         return result = true;
     }else
         return result = false;
    }
}
