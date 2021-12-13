package clean.code.chess.requirements;

public class ChessBoard {

    public static int MAX_BOARD_WIDTH = 7;
    public static int MAX_BOARD_HEIGHT = 7;

    private Pawn[][] pieces;

    public ChessBoard() {
        pieces = new Pawn[MAX_BOARD_WIDTH][MAX_BOARD_HEIGHT];

    }

    public void Add(Pawn pawn, int xCoordinate, int yCoordinate, PieceColor pieceColor) {
        if (pawn.getPieceColor() == null) pawn.setPieceColor(pieceColor);
        if (pawn.getPieceColor() != pieceColor) throw new UnsupportedOperationException("Pawn colours don't match");

        int pawnRow = pawn.getPieceColor() == PieceColor.BLACK ? MAX_BOARD_HEIGHT - 1 : 1;

        if (this.IsLegalBoardPosition(xCoordinate, yCoordinate) && xCoordinate == pawnRow) {
            if (pieces[xCoordinate][yCoordinate] == null) {
                pawn.setChessBoard(this);
                pawn.setXCoordinate(xCoordinate);
                pawn.setYCoordinate(yCoordinate);
                pieces[xCoordinate][yCoordinate] = pawn;

            } else this.DeclinePawnPlacement(pawn);

        } else this.DeclinePawnPlacement(pawn);
    }

    public boolean IsLegalBoardPosition(int xCoordinate, int yCoordinate) {
        return xCoordinate >= 0 && xCoordinate <= MAX_BOARD_WIDTH && yCoordinate >= 0 && yCoordinate <= MAX_BOARD_HEIGHT;
    }

    public void DeclinePawnPlacement(Pawn pawn) {
        pawn.setXCoordinate(-1);
        pawn.setYCoordinate(-1);
    }

    public Pawn[][] getPieces() {
        return pieces;
    }
}
