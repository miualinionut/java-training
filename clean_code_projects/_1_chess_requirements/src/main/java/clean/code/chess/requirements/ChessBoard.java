package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    public static int MIN_BOARD_HEIGHT = 0;
    public static int MIN_BOARD_WIDTH = 0;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];// NU TREBUIA MAX+1 ADICA 8? TABLA DE SAH ARE 8X8 PATRATE

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {

        if (pieceColor == PieceColor.BLACK)
            if ((xCoordinate == 6 || xCoordinate == 7) && IsLegalBoardPosition(xCoordinate, yCoordinate)) {
                pawn.setYCoordinate(yCoordinate);
                pawn.setXCoordinate(xCoordinate);
            }
        else
            if((xCoordinate == 0 || xCoordinate == 1) && IsLegalBoardPosition(xCoordinate,yCoordinate)){
                pawn.setYCoordinate(yCoordinate);
                pawn.setXCoordinate(xCoordinate);
            }
    }


    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {

        if(xCoordinate > MAX_BOARD_HEIGHT || yCoordinate > MAX_BOARD_WIDTH || xCoordinate < MIN_BOARD_HEIGHT || yCoordinate < MIN_BOARD_WIDTH)
            return false;
        return true;

    }
}
