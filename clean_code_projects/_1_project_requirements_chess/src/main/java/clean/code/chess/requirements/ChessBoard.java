package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;
    public static int black_pawns = 0;
    public static int white_pawns = 0;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH + 1][MAX_BOARD_HEIGHT + 1];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        pawn.setXCoordinate(-1);
        pawn.setYCoordinate(-1);
        if(pieces[xCoordinate][yCoordinate] == null) {
            switch(pieceColor) {
                case BLACK:
                    black_pawns++;
                    break;
                case WHITE:
                    white_pawns++;
                    break;
            }
            if(black_pawns <= 7 && white_pawns <= 7) {
                pieces[xCoordinate][yCoordinate] = pawn;
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                pawn.setPieceColor(pieceColor);
            }
        }
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        if(xCoordinate >= 0 && xCoordinate <= 7 && yCoordinate >= 0 && yCoordinate <=7)
            return true;
        else
            return false;
    }
}
