package clean.code.chess.requirements;

public class Pawn {

    private ChessBoard chessBoard;
    private int xCoordinate;
    private int yCoordinate;
    private PieceColor pieceColor;

    public Pawn(PieceColor pieceColor) {
        this.pieceColor = pieceColor;
        xCoordinate = -1;
        yCoordinate = -1;
    }

    public ChessBoard getChesssBoard() {
        return chessBoard;
    }

    public void setChessBoard(ChessBoard chessBoard) {
        this.chessBoard = chessBoard;
    }

    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int value) {
        this.xCoordinate = value;
    }

    public int getYCoordinate() {
        return yCoordinate;
    }

    public void setYCoordinate(int value) {
        this.yCoordinate = value;
    }

    public PieceColor getPieceColor() {
        return this.pieceColor;
    }

    private void setPieceColor(PieceColor value) {
        pieceColor = value;
    }

    public void Move(MovementType movementType, int newX, int newY) {
        if (chessBoard.IsLegalBoardPosition(newX, newY)) {
            if (movementType == MovementType.MOVE) {
                if (newX == xCoordinate &&
                        (pieceColor == PieceColor.BLACK && newY == yCoordinate - 1) ||
                        (pieceColor == PieceColor.WHITE && newY == yCoordinate + 1)) {
                    yCoordinate = newY;
                }

            } else
                throw new UnsupportedOperationException("Need to implement Pawn.Move()");
        }
    }

    @Override
    public String toString() {
        return CurrentPositionAsString();
    }

    protected String CurrentPositionAsString() {
        String eol = System.lineSeparator();
        return String.format("Current X: %d; Current Y: %d; Piece Color: %s%s", xCoordinate, yCoordinate, pieceColor, eol);
    }
}
