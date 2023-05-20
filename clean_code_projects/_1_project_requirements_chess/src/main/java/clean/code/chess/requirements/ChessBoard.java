package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 8;
    public static int MAX_BOARD_HEIGHT = 8;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];
    }

    public void add(Pawn piece, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (isLegalBoardPosition(xCoordinate, yCoordinate)) {
            piece.setXCoordinate(xCoordinate);
            piece.setYCoordinate(yCoordinate);
            piece.setPieceColor(pieceColor);
            pieces[xCoordinate][yCoordinate] = piece;
        }
    }

    public boolean isLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return xCoordinate >= 0 && xCoordinate < MAX_BOARD_WIDTH &&
                yCoordinate >= 0 && yCoordinate < MAX_BOARD_HEIGHT;
    }

    public Pawn getPiece(int xCoordinate, int yCoordinate) {
        if (isLegalBoardPosition(xCoordinate, yCoordinate)) {
            return pieces[xCoordinate][yCoordinate];
        }
        return null;
    }
}
